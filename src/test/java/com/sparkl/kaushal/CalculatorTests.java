package com.sparkl.kaushal;

import org.junit.jupiter.api.Test;

public class CalculatorTests {
  @Test
  void testAddition() {
    Calculator calculator = new Calculator();
    int result = calculator.add(2, 3);
    assert result == 5;
  }
}
