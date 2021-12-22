package com.company;

import java.util.List;

public class Employee {
    private String employeeId;
    private String employeeName;
    private Integer employeeSalary;
    private String locationId;
    private String deptId;
    private List<String> benefitId;

    public Employee(String employeeId, String employeeName, Integer employeeSalary, String locationId, String deptId, List<String> benefitId) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.locationId = locationId;
        this.deptId = deptId;
        this.benefitId = benefitId;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public List<String> getBenefitId() {
        return benefitId;
    }

    public void setBenefitId(List<String> benefitId) {
        this.benefitId = benefitId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", locationId='" + locationId + '\'' +
                ", deptId='" + deptId + '\'' +
                ", benefitId=" + benefitId +
                '}';
    }
}
