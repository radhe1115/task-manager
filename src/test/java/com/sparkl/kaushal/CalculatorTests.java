package com.sparkl.kaushal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.sparkl.kaushal.service.Calculator;

public class CalculatorTests {
  @Test
  void testAddition() {
    Calculator calculator = new Calculator();
    int result = calculator.add(2, 3);
    assert result == 5;
  }
  @Test
  void testSubstraction(){
    Calculator calculator = new Calculator();

    int results = calculator.substract(3, 1);
    assertEquals(2, results);
  }

  @Test
  void testDivision() {
    // Arrange
    Calculator calculator = new Calculator();

    // Act
    int result = calculator.divide(6, 3);

    // Assert
    assertEquals(2, result);
  }
}
