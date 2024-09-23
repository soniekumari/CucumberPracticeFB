package stepdefinitions;

import org.junit.Assert;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	public LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private static String title;
	@Given("User is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.facebook.com/");
	}

	@When("User gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 title = loginPage.getLoginPageTitle();
		 System.out.println("Login page title is : " + title);
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		 title = loginPage.getLoginPageTitle();
		 System.out.println("Login page title is : " + title);
		 Assert.assertTrue(title.contains(expectedTitle));
	}
	
	@When("User enters Username {string}")
	public void user_enters_username(String userName) {
		loginPage.enterUserEmail(userName);
	}
	
	@When("User enters Password {string}")
	public void user_enters_password(String password) {
		loginPage.enterUserPass(password);
	}
	@Then("Forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginPage.getForgotPasswordLinkExist());
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
		loginPage.clickLoginBtn();
	}

}
