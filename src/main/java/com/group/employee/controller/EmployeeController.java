package com.group.employee.controller;

import com.group.employee.dto.request.EmployeeCreateRequest;
import com.group.employee.dto.request.TeamCreateRequest;
import com.group.employee.dto.response.EmployeeResponse;
import com.group.employee.service.EmployeeService;
import com.group.employee.service.TeamService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EmployeeController {

    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }

    @PostMapping("/employee")
    public void saveEmployee(@RequestBody EmployeeCreateRequest request){
        employeeService.saveEmployee(request);
    }
    @GetMapping("/employee")
    public List<EmployeeResponse> getEmployees(){
        return employeeService.getEmployees();

    }

}
