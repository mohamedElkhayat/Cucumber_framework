package steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Homepage;
import tests.TestBase;

public class Search extends TestBase{
	Homepage homeobj;
	@Given("^user from homepage enter \"([^\"]*)\" on search box$")
	public void user_from_homepage_enter_on_search_box(String word)  {
		homeobj = new Homepage(driver);
		homeobj.user_search(word);
	}

	@When("^user enter search button or enter$")
	public void user_enter_search_button_or_enter()  {
		homeobj = new Homepage(driver);
		homeobj.user_click_search();
	}

	@Then("^system redirect to dress page$")
	public void system_redirect_to_dress_page()  {
	    Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=dress&submit_search=");
	}
}
