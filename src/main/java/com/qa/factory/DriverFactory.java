package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		System.out.println("Browser values is:" + browser);
		
		
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
		}
		else if(browser.equals("safari")) {
			WebDriverManager.iedriver().setup();
			tlDriver.set(new SafariDriver());
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Please pass the correct browser value: " + browser);
		}
		getDriver().manage().window().maximize();
		return getDriver();
	}
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
	

}
