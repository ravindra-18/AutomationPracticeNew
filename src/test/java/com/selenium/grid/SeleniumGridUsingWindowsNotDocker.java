package com.selenium.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridUsingWindowsNotDocker {
	
	//*********cmd command= java -jar selenium-server-4.29.0.jar standalone(important) 
	
   //*********folder name=C:\selenium_grid_server
	@Parameters({"browser", "os"})
	@Test
	public void launchGridEnv(String browser, String os) throws MalformedURLException 
	
	{
		String hubUrl = "http://192.168.55.41:4444/wd/hub";

	    WebDriver driver;

	    if(browser.equalsIgnoreCase("chrome")) {
	        ChromeOptions options = new ChromeOptions();

	        if(os.equalsIgnoreCase("windows")) {
	            options.setPlatformName("windows");
	        } else {
	            options.setPlatformName("linux");
	        }

	        driver = new RemoteWebDriver(new URL(hubUrl), options);
	    }
	    else {
	        FirefoxOptions options = new FirefoxOptions();
	        driver = new RemoteWebDriver(new URL(hubUrl), options);
	    }

	    driver.get("https://www.facebook.com/");
	    System.out.println(driver.getTitle());
	    driver.quit();
	}


}
