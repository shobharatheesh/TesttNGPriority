package com.udemy;

import org.testng.annotations.Test;

public class TestngPriority {

    @Test

    public void loginTest()
    {
        System.out.println("Login Test");
    }

    @Test
    public void addToCart()
    {
        System.out.println("Add To the cart");
    }

    @Test

    public void logoutTest()
    {
        System.out.println("Logout Test");
    }


}
