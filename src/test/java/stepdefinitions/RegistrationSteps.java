package stepdefinitions;

import java.util.List;

import org.junit.Assert;
import com.pages.RegistrationPage;
import com.qa.factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class RegistrationSteps {
	
	public RegistrationPage regPage = new RegistrationPage(DriverFactory.getDriver());
	@Given("User is on Login page")
	public void user_is_on_login_page() {
	    DriverFactory.getDriver().get("https://www.facebook.com/");
	}
	
	@Given("User click on Create New Account button")
	public void user_click_on_create_new_account_button() {
	    regPage.clickCreateAccount();
	}
	
	@Then("User is on Registration form {string}")
	public void user_is_on_registration_form(String expectedText) {
	   Assert.assertTrue(expectedText.equals(regPage.registrationForm()));
	}

	
	@Then("User gets count of gender")
	public void user_gets_count_of_gender(DataTable genderLists) {
		
		List<String> expectedGenderList = genderLists.asList();
		System.out.println("Expected Gender option List: " + expectedGenderList);
		
		List<String> actualGenderList = regPage.getGenderOptionList();
		System.out.println("Actual Gender option List: " + actualGenderList);
		
		Assert.assertTrue(expectedGenderList.containsAll(actualGenderList));
	    
	}

	@Then("User gender option should be {int}")
	public void user_gender_option_should_be(Integer expectedGenderCount) {
	    Assert.assertTrue(regPage.getGenderOptionCounts() == expectedGenderCount);
	}


}
