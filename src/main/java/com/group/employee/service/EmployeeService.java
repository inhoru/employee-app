package com.group.employee.service;

import com.group.employee.domain.employee.Employee;
import com.group.employee.domain.employee.EmployeeRepository;
import com.group.employee.dto.request.EmployeeCreateRequest;
import com.group.employee.dto.response.EmployeeResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Transactional
    public void saveEmployee(EmployeeCreateRequest request){
        employeeRepository.save(new Employee(request.getName(), request.getTeamName(),request.getRole(),request.getBirthDay()));
    }
    @Transactional(readOnly = true)
    public List<EmployeeResponse> getEmployees(){
        return employeeRepository.findAll()
                .stream().map(EmployeeResponse::new)
                .collect(Collectors.toList());
    }

}
