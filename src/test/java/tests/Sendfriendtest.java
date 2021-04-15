package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Product_page;
import pages.Send_friend_page;

public class Sendfriendtest extends TestBase {
	@Test
	public void user_send_friend() {
	 Homepage Homeobject;
	 Homeobject = new Homepage(driver);
	   Homeobject.open_product();
	   Product_page productobj;
	    productobj = new Product_page(driver);
	    productobj.click_sendfriend();
	   Send_friend_page sendobject;
		  sendobject = new Send_friend_page(driver);
		  sendobject.user_send_to_friend("ali", "m555@gmail.com");
		  Assert.assertTrue(sendobject.sucsseful_massage.isDisplayed());
	}
}
