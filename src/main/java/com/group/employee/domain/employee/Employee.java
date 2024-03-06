package com.group.employee.domain.employee;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDate;

@Entity
@DynamicInsert
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String teamName;
    @Column(nullable = false)
    private String role;
    @Column(nullable = false)
    private LocalDate birthDay;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDate workStartDate;

    public Employee(String name, String teamName, String role, LocalDate birthDay) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthDay = birthDay;
    }

    public Long getId() {
        return id;
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

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    protected Employee() {
    }


}



