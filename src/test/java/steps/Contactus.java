package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Contactuspage;
import pages.Homepage;
import tests.TestBase;

public class Contactus extends TestBase {
	Homepage homeobject;
	Contactuspage contobj;
	@Given("^user from home page click on contact us link$")
	public void user_from_home_page_click_on_contact_us_link()  {
		homeobject = new Homepage(driver);
		homeobject.click_contactus();
	}

	@When("^User enter \"([^\"]*)\" ,\"([^\"]*)\" , \"([^\"]*)\" and click send$")
	public void user_enter_and_click_send(String email, String refrence, String massage)  {
		contobj = new Contactuspage(driver);
		contobj.user_send_massage(email, refrence, massage);
	}

	@Then("^massage appears \"([^\"]*)\"$")
	public void massage_appears(String arg1)  {
	    Assert.assertTrue(contobj.sucsseful_massage_send.getText().contains("Your message has been successfully sent to our team."));
	}
}
