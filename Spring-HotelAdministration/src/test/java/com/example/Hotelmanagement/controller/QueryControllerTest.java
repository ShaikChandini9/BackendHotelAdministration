package com.example.Hotelmanagement.controller;

import com.example.Hotelmanagement.dto.IssueRequest;
import com.example.Hotelmanagement.model.Employee;
import com.example.Hotelmanagement.service.QueryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class QueryControllerTest {

    @InjectMocks
    QueryController queryController;

    @Mock
    QueryService queryService;

    IssueRequest issuerequest=new IssueRequest();
    List<Employee> employeeList=new ArrayList<>();
    Employee employee=new Employee();

    @Test
    public void fetchEmployeeTest(){
        employee.setEmployeename("john");
        employee.setEmpid(234L);
        employee.setDesignation("room service");
        employee.setAssignedtask("cleaning");
        employeeList.add(employee);
        when(queryService.getAllEmployee()).thenReturn(employeeList);
        ResponseEntity responseEntity=queryController.fetchEmployee();
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void updatestatusTest(){

        queryService.updateStatus(342L,"checking");
        ResponseEntity responseEntity=queryController.updatestatus(342L,"checking");
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void addTaskTest(){

        issuerequest.setIssue("room service");
        issuerequest.setIssueid(234L);
        issuerequest.setStatus("checking");
        queryService.addTask(issuerequest);
        ResponseEntity responseEntity=queryController.addTask(issuerequest);
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void assigningTaskTest(){

        queryService.taskassigning(234L,123L);
        ResponseEntity responseEntity=queryController.assigningTask(234L,123L);
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }
}
