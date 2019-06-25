package com.gbhtest;


import com.gbhtest.Setup.testSetup;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Logintest {

    private static WebDriver driver;

    @BeforeClass
    private void setUp() {
        testSetup.Setup();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public static void main(String[] args) {

    }
}