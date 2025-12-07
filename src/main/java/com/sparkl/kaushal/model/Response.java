package com.sparkl.kaushal.model;

public class Response {
  String statusDes;
  Object details;
  public String getStatusDes() {
    return statusDes;
  }
  public void setStatusDes(String statusDes) {
    this.statusDes = statusDes;
  }
  public Object getDetails() {
    return details;
  }
  public void setDetails(Object details) {
    this.details = details;
  }
  @Override
  public String toString() {
    return "Response [statusDes=" + statusDes + ", details=" + details + "]";
  }
  
}
