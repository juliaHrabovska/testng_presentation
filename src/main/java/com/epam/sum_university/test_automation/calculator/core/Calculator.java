package com.epam.sum_university.test_automation.calculator.core;

public class Calculator implements CalculatorInterface {
    @Override
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtraction(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int multiplication(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public double division(double n1, double n2) {
        if (n2 == 0) {
            throw new ArithmeticException();
        }
        return n1 / n2;
    }
}
