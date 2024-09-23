package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
		
	private By email = By.id("email");
	private By psw = By.id("pass");
	private By loginBtn = By.name("login");
	private By forgotPsw = By.linkText("Forgotten password?");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	public boolean getForgotPasswordLinkExist() {
		return driver.findElement(forgotPsw).isDisplayed();
	}
	public void enterUserEmail(String userEmail) {
		driver.findElement(email).sendKeys(userEmail);
	}
	public void enterUserPass(String pass) {
		driver.findElement(psw).sendKeys(pass);
	}
	public void clickLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
}
