package com.gbhtest.Screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homeScreen {

    private WebDriver driver;

    private class Home {
        driver.findElement(By.ByXPath("//na-login/style/paperbutton/iron-icon/span[text()='Sing in with Google']")).click();
    }
}
