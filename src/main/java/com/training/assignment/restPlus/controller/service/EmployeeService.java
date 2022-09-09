package com.training.assignment.restPlus.controller.service;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.training.assignment.restPlus.model.EmployeeBean;

@Service
public class EmployeeService {

  RestTemplate restTemplate;

  @Value("${website.url}")
  String url;
  @Value("${website.employee}")
  String employeeExtension;

  ObjectMapper objectMapper = new ObjectMapper();
  List<EmployeeBean> searchHistory;


  @Autowired
  private EmployeeService(@Lazy RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();

  }

  public EmployeeBean getEmployee(int employeeId) {
    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    HttpEntity<String> entity = new HttpEntity<>(headers);
    EmployeeBean employeeBean = this.restTemplate
        .exchange(url + employeeExtension + employeeId, HttpMethod.GET, entity, EmployeeBean.class)
        .getBody();
    return employeeBean;
  }

  public void postEmployee(EmployeeBean teleData) {
    this.restTemplate.postForObject(url + employeeExtension, teleData, EmployeeBean.class);
  }

  public void putEmployee(EmployeeBean teleData) {
    this.restTemplate.put(url + employeeExtension, teleData);
  }

  public void deleteEmployee(int employeeId) {
    this.restTemplate.delete(url + employeeExtension + employeeId);
  }

}
