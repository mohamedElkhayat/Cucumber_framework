package tests;



import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.myaccount;

public class logintest extends TestBase{
	Homepage homeobject;
	myaccount accountobject;
	@DataProvider(name="testdata")
	public static Object[][]userdata()
	{
		return new Object[][] {{"tommie.crooks@hotmail.com","1830168317"},
			{"tommie.crooks@hotmail.com","1830168329"}};
	}
	@Test(dataProvider = "testdata")

	public void usercanlogin(String email, String password) 
	{
		homeobject = new Homepage(driver);
		homeobject.opensinginlink();
		accountobject = new myaccount(driver);
		accountobject.usercanlogin(email, password);
		accountobject.clicksubmit();
		Assert.assertEquals(driver.getCurrentUrl(),
				"http://automationpractice.com/index.php?controller=my-account");
		accountobject.singout();
	}
}
