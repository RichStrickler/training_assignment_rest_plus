package com.training.assignment.restPlus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.training.assignment.restPlus.controller.service.EmployeeService;
import com.training.assignment.restPlus.model.EmployeeBean;

@RestController
public class EmployeeController {

  @Autowired
  EmployeeService employeeService;

  String firstname;

  @PostMapping("/employee")
  @ResponseBody
  public void postEmployee(@RequestBody EmployeeBean teleData) {
    employeeService.postEmployee(teleData);


  }

  @GetMapping("/employee/{id}")
  @ResponseBody
  public EmployeeBean getEmployee(@PathVariable("id") int employeeId) {
    return employeeService.getEmployee(employeeId);

  }


  @DeleteMapping("/employee/{id}")
  @ResponseBody
  public void deleteEmployee(@PathVariable("id") int employeeId) {
    employeeService.deleteEmployee(employeeId);

  }

  @PutMapping("/employee")
  @ResponseBody
  public void putEmployee(@RequestBody EmployeeBean teleData) {
    employeeService.postEmployee(teleData);

  }

}
