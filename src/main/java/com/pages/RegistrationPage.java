package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage {
	
	private WebDriver driver;
	private By createAccount = By.xpath("//*[text()='Create new account']");
	private By RegistrationForm = By.xpath("//div[text()='Sign Up']");
	private By gender = By.xpath("//*[@data-name='gender_wrapper']/span/label[@for='sex']");
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickCreateAccount() {
		driver.findElement(createAccount).click();
	}
	
	public String registrationForm() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(RegistrationForm));
		return driver.findElement(RegistrationForm).getText();
	}
	public int getGenderOptionCounts() {
		System.out.println(driver.findElements(gender).size());
		return driver.findElements(gender).size();
	}
	
	public List<String> getGenderOptionList() {
		
		List<String> genderList = new ArrayList<>();
		List<WebElement> list = driver.findElements(gender);
		
		for(WebElement e : list) {
			String gender = e.getText();
			System.out.println(gender);
			genderList.add(gender);
		}
		return genderList;
	}
}
