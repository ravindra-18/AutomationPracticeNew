package com.selenium.grid; 
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SeleniumGridUsingDockerLinux{
	

@Parameters({"browser"})
@Test
public void launchGridEnv(String browser) throws MalformedURLException 

    {
	
    String hubUrl = "http://192.168.55.41:4444"; // correct for selenium4

    WebDriver driver = null;

    if(browser.equalsIgnoreCase("chrome")) {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL(hubUrl), options);
    } 
    else if(browser.equalsIgnoreCase("firefox")) {
        FirefoxOptions options = new FirefoxOptions();
        driver = new RemoteWebDriver(new URL(hubUrl), options);
    }

    driver.get("https://www.facebook.com/");
    System.out.println(driver.getTitle());
    driver.quit();
}
}