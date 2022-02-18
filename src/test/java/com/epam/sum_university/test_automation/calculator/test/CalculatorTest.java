package com.epam.sum_university.test_automation.calculator.test;

import com.epam.sum_university.test_automation.calculator.core.Calculator;
import com.epam.sum_university.test_automation.calculator.core.CalculatorInterface;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Random;

public class CalculatorTest {
    private CalculatorInterface calculator;
    private int n1;
    private int n2;

    @BeforeClass
    public void setUpCalculator() {
        calculator = new Calculator();
    }

    @BeforeMethod
    public void setUpTestData() {
        n1 = new Random().nextInt();
        n2 = new Random().nextInt();
    }

    @DataProvider(name = "multiplicationData")
    public static Object[][] multiplicationData() {
        return new Object[][] {
                {2, 2, 4},
                {-2, 2, -4},
                {-2, -2, 4}
        };
    }

    @Test
    public void sumTest() {
        Assert.assertEquals(calculator.sum(n1, n2), n1 + n2,
                String.format("Sum of %d and %d is not valid", n1, n2));
    }

    @Test
    public void subtractionTest() {
        Assert.assertEquals(calculator.subtraction(n1, n2), n1 - n2 - 1,
                String.format("Subtraction of %d and %d is not valid", n1, n2));
    }

    @Test(dataProvider = "multiplicationData", dependsOnGroups = "negative")
    public void multiplicationTest(int n1, int n2, int result) {
        Assert.assertEquals(calculator.multiplication(n1, n2), result,
                String.format("multiplication of %d and %d is not valid", n1, n2));
    }

    @Test(expectedExceptions = ArithmeticException.class, groups = "negative")
    public void divisionTest() {
        double i = calculator.division(5, 0);
        System.out.println(i);
    }

    @Test(enabled = false)
    public void enabledTest() {
        System.out.println("Disabled test");
    }

}
