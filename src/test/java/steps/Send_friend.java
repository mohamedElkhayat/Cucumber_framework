package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import pages.Product_page;
import pages.Send_friend_page;
import tests.TestBase;

public class Send_friend extends TestBase {
	 Homepage Homeobject;
	@Given("^user click on blouse product from home page$")
	public void user_click_on_blouse_product_from_home_page()  {
	   Homeobject = new Homepage(driver);
	   Homeobject.open_product();
	}

	@When("^click on send to friendproduct page$")
	public void click_on_send_to_friendproduct_page()  {
	    Product_page productobj;
	    productobj = new Product_page(driver);
	    productobj.click_sendfriend();
	}

	@When("^enter \"([^\"]*)\",\"([^\"]*)\" click send$")
	public void enter_click_send(String name, String email)  {
	  Send_friend_page sendobject;
	  sendobject = new Send_friend_page(driver);
	  sendobject.user_send_to_friend(name, email);
	}

	@Then("^appear to pop massage Your e-mail has been sent successfully$")
	public void appear_to_pop_massage_Your_e_mail_has_been_sent_successfully() {
		Send_friend_page sendobject;
		  sendobject = new Send_friend_page(driver);
		  Assert.assertTrue(sendobject.sucsseful_massage.isDisplayed());
	}

}
