package com.training.assignment.restPlus.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"firstName", "lastName", "id", "deptId", "statCd"})
public class EmployeeBean {

  public String firstName;
  public String lastName;
  public int id;
  public int deptId;
  public int statCd;


  @JsonGetter("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  @JsonGetter("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @JsonGetter("id")
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @JsonGetter("deptId")
  public int getDeptId() {
    return deptId;
  }

  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }

  @JsonGetter("statCd")
  public int getStatCd() {
    return statCd;
  }

  public void setStatCd(int statCd) {
    this.statCd = statCd;
  }

}
