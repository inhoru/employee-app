package com.group.employee.dto.response;

import com.group.employee.domain.employee.Employee;

import java.time.LocalDate;

public class EmployeeResponse {

    private String name;
    private String teamName;
    private String role;
    private LocalDate birthDay;
    private LocalDate wokrStartDate;

    protected EmployeeResponse() {
    }

    public EmployeeResponse(String name, String teamName, String role, LocalDate birthDay, LocalDate wokrStartDate) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthDay = birthDay;
        this.wokrStartDate = wokrStartDate;
    }

    public EmployeeResponse(Employee employee){
        this.name = employee.getName();
        this.teamName = employee.getTeamName();
        this.role = employee.getRole();
        this.birthDay = employee.getBirthDay();
        this.wokrStartDate = employee.getWorkStartDate();
    }


    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getRole() {
        return role;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public LocalDate getWokrStartDate() {
        return wokrStartDate;
    }
}
