package com.group.employee.dto.request;

import java.time.LocalDate;

public class EmployeeCreateRequest {
    private String name;
    private String teamName;
    private String role;
    private LocalDate birthDay;


    public EmployeeCreateRequest() {
    }

    public EmployeeCreateRequest(String name, String teamName, String role, LocalDate birthDay) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthDay = birthDay;

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


}
