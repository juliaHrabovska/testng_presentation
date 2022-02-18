package com.epam.sum_university.test_automation.calculator.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

    @BeforeMethod
    public void setUp() {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("@AfterMethod");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("BeforeGroups");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("@AfterGroups");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @Test
    public void test() {
        System.out.println("@Test");
    }

}
