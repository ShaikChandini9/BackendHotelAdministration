package com.example.Hotelmanagement.service;

import com.example.Hotelmanagement.model.Employee;
import com.example.Hotelmanagement.model.Issue;
import com.example.Hotelmanagement.repository.EmployeeRepository;
import com.example.Hotelmanagement.repository.IssueRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class QueryServiceTest {

    @InjectMocks
    private QueryService queryService;

    @Mock
    IssueRepository issueRepository;

    @Mock
    EmployeeRepository employeerepo;

    List<Issue> issues=new ArrayList<>();
    Issue issue=new Issue();

    List<Employee> employees=new ArrayList<>();
    Employee employee=new Employee();

    @BeforeEach
    public void testdata(){

        issue.setIssueid(234L);
        issue.setIssue("room service");
        issue.setStatus("checking");

        employee.setEmpid(123L);
        employee.setEmployeename("john");
        employee.setAssignedtask("room service");
        employee.setDesignation("service boy");

        issue.setEmployee(employee);
        issues.add(issue);

        employee.setIssue(issues);
        employees.add(employee);
    }
    @Test
    public void getAllEmployeeTest(){

        when(employeerepo.findAll()).thenReturn(employees);
        List<Employee> actual=queryService.getAllEmployee();
        assertNotNull(actual);
    }

    @Test
    public void addTaskTest(){

        
    }
}
