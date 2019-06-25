package com.gbhtest.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSetup {
    public static WebDriver driver;

    public static void Setup() {
         driver = new ChromeDriver();
        driver.get("https://gbhqatest.firebaseapp.com");
    }
}
