package com.epam.sum_university.test_automation.calculator.core;

public interface CalculatorInterface {
    int sum(int n1, int n2);
    int subtraction(int n1, int n2);
    int multiplication(int n1, int n2);
    double division(double n1, double n2) throws ArithmeticException;
}
