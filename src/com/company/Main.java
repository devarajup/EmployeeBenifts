package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        //department details
        Department department1 = new Department("D1", "Healthcare");
        Department department2 = new Department("D2", "Finance");
        Department department3 = new Department("D3", "Admin");
        Department department4 = new Department("D4", "Fraud");
        List<Department> departmentList = Arrays.asList(department1, department2, department3, department4);
        //  location details
        Location location1 = new Location("L1", "Hyderabad", "India");
        Location location2 = new Location("L2", "Chennai", "India");
        Location location3 = new Location("L3", "London", "United Kingdom");

        List<Location> locations = Arrays.asList(location1, location2, location3);
        //   Benefits details
        Benefits benefit1 = new Benefits("B1", "Platunum", "its only for self");
        Benefits benefit2 = new Benefits("B2", "Silver", "its including dependent and  self");
        Benefits benefit3 = new Benefits("B3", "Gold", "its including dependent and  self upto 50% coverage above 1CR");

        List<Benefits> benefitsList = Arrays.asList(benefit1, benefit2, benefit3);

        //Employee deatails
        Employee employee1 = new Employee("E1", "Ram", 15000, "L3", "D1", Arrays.asList("B1", "B2"));
        Employee employee2 = new Employee("E2", "deva", 18000, "L2", "D2", Arrays.asList("B2", "B3"));
        Employee employee3 = new Employee("E3", "vamsi", 20000, "L1", "D3", Arrays.asList("B3", "B2"));
        Employee employee4 = new Employee("E4", "anil", 12000, "L3", "D4", Arrays.asList("B2", "B3"));
        Employee employee5 = new Employee("E5", "gopi", 25000, "L1", "D1", Arrays.asList("B1", "B2"));
        Employee employee6 = new Employee("E6", "rahul", 30000, "L2", "D2", Arrays.asList("B1", "B3"));
        List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6);

        // a) all employees in India
        List<String> lo = locations.stream().filter(location -> location.getLocationCountry().contains("India")).map(l -> l.getLocationId()).collect(Collectors.toList());
        List<String> employeeNames = employees.stream().filter(employee -> lo.stream().anyMatch(loc -> loc.equals(employee.getLocationId()))).map(eName -> eName.getEmployeeName()).collect(Collectors.toList());
        employeeNames.forEach(System.out::println);
        System.out.println("__________________________________________________________________________");
        //b)employees who are in Chennai or Hyderabad
        List<String> lo1 = locations.stream().filter(location -> location.getLocationName().contains("Chennai") || location.getLocationName().contains("Hyderabad")).map(l -> l.getLocationId()).collect(Collectors.toList());
        List<String> employeeNames1 = employees.stream().filter(employee -> lo.stream().anyMatch(loc -> loc.equals(employee.getLocationId()))).map(eName -> eName.getEmployeeName()).collect(Collectors.toList());
        employeeNames.forEach(System.out::println);

        //c)Retrieve employees Benefits and display benefits detail
        //  benefitsList.stream().filter(ben->employees.stream().anyMatch(e->e.getBenefitId().contains(ben.getBenefitId()))).collect(Collectors.toList()).forEach(System.out::println);
        //        benefitsList.stream().filter(b->employees.stream().anyMatch(employee -> employee.getBenefitId().contains(b.getBenefitId()))).forEach(System.out::println);

        employees.stream().forEach(employee -> {
            System.out.println(employee.getEmployeeName());
            benefitsList.stream().filter(ben -> employee.getBenefitId().contains(ben.getBenefitId())).forEach(System.out::println);

        });

//        d)employee details -  employeeId, employeeName, Salary, deptName, locationName, locationCountry
        employees.stream().forEach(employee -> {
            System.out.print("employeeId:" + employee.getEmployeeId() + "\t employeeName:" + employee.getEmployeeName() + "\t Salary :" + employee.getEmployeeSalary() + "\t");
            departmentList.stream().filter(dep -> employee.getDeptId().contains(dep.getDeptId())).forEach(department -> System.out.print("\tDepartment Name :" + department.getDeptName()));
            locations.stream().filter(location -> employee.getLocationId().contains(location.getLocationId())).forEach(location -> System.out.println("\t\tLoacation :" + location.getLocationName() + "\t" + location.getLocationCountry()));
            System.out.println();
        });
//        employees who are in Chennai and India

         List<String> lId =  locations.stream().filter(location -> location.getLocationName().contains("Chennai")&&location.getLocationCountry().contains("India")).map(location -> location.getLocationId()).collect(Collectors.toList());
        System.out.println(lId);
        employees.stream().filter(employee -> lId.stream().anyMatch(e->e.equals(employee.getLocationId()))).forEach(employee -> System.out.println(employee.getEmployeeName()));

    }
}
