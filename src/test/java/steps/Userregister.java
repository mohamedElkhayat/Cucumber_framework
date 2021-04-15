package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import pages.Registerpage;
import pages.myaccount;
import tests.TestBase;

public class Userregister extends TestBase {
	Homepage homeobject;
	myaccount accountobject;
	Registerpage registerobject;
	@Given("^user from homepage click on signin link$")
	public void user_from_homepage_click_on_signin_link()  {
		homeobject = new Homepage(driver);
		homeobject.opensinginlink();
	}

	@When("^user enter valid \"([^\"]*)\" from signin page$")
	public void user_enter_valid_email_from_signin_page(String email)  {
		accountobject = new myaccount(driver);
		accountobject.usercanregister(email);
	}

	@When("^user enter \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\",\"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enter_user_data(String firstname,String lasttname,String password,String city,String postcode,
			String mobile,String adress2,String adress1)  {
		registerobject = new Registerpage(driver);
		registerobject.userdataregister(firstname, lasttname, password, city, postcode, mobile, adress2
					, adress1); 
			registerobject.selectstate();
	}

	@Then("^user signin sucssefully and name account appear to homepage$")
	public void user_signin_sucssefully_and_name_account_appear_to_homepage()  {
		Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
	}
}
