package com.udemy;

import org.testng.annotations.*;

public class BeforeClass_BeforeMethod {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class"); //run once per class
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");  // run before and after al test methods
    }

    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test
    public void test2() {
        System.out.println("Test 2");
    }

    @AfterMethod
    public void afterMethod() {
            System.out.println("After Method");
    }

    @AfterClass

    public void afterClass()
    {
        System.out.println("After Class");

    }
}

