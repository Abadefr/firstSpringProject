package com.EmployeerAplication.EmployeerAplication.controller.Entity;

public class Employee {
    int emplyeeId;
    String employeeName;
    int emplyeerAge;
    String getEmployeeCity;


    public Employee(int emplyeeId, String employeeName, int emplyeerAge, String getEmployeeCity) {
        this.emplyeeId = emplyeeId;
        this.employeeName = employeeName;
        this.emplyeerAge = emplyeerAge;
        this.getEmployeeCity = getEmployeeCity;
    }

    public int getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(int emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGetEmployeeCity() {
        return getEmployeeCity;
    }

    public void setGetEmployeeCity(String getEmployeeCity) {
        this.getEmployeeCity = getEmployeeCity;
    }
}
