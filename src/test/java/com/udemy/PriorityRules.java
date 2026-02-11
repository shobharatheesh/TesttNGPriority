package com.udemy;

import org.testng.annotations.Test;

public class PriorityRules {

    @Test(priority = -1)
    public void openBrowser()
    {
        System.out.println("Executes before 0");
    }

    @Test(priority = 0)
    public void login() {
        System.out.println("Executes first");
    }

    @Test(priority = 1)
    public void logout() {
        System.out.println("Executes later");
    }
}
