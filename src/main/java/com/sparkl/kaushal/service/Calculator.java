package com.sparkl.kaushal.service;

public class Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public int substract(int a, int b){
    return a-b;
  }
  public int divide(int a,int b) {
    if (b == 0) {
      throw new ArithmeticException("Can not Divide by 0.");
    } else {
      return a / b;
    }
  }
}
