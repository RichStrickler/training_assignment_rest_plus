package com.training.assignment.restPlus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.training.assignment.restPlus.controller.service.EmployeeService;
import com.training.assignment.restPlus.model.Employee;

@RestController
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  @PostMapping("/employee")
  @ResponseBody
  public void postEmployee(@RequestBody Employee teleData) {
    employeeService.postEmployee(teleData);


  }

  @GetMapping("/employee/{id}")
  @ResponseBody
  public String getEmployee(@PathVariable("id") int employeeId) {
    return employeeService.getEmployee(employeeId);

  }

}
