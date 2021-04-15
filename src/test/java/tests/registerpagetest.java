package tests;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.Homepage;
import pages.Registerpage;
import pages.myaccount;

public class registerpagetest extends TestBase {
	Faker fakedata = new Faker();
	String firstname = fakedata.name().firstName();
	String lasttname = fakedata.name().lastName();
	String email = fakedata.internet().emailAddress();
	String password = fakedata.number().digits(10);
	String city = fakedata.country().capital();
	String postcode = fakedata.number().digits(5);
	String mobile = fakedata.phoneNumber().cellPhone();
	String adress1 = fakedata.address().fullAddress();
	String adress2 = fakedata.address().secondaryAddress();
	Homepage homeobject;
	myaccount accountobject;
	Registerpage registerobject;
	@Test
	@Severity(SeverityLevel.CRITICAL)
	@Description("user registeration test case")
	@Link(url = "http\\www.google.com")
public void usercanregister() 
{
	homeobject = new Homepage(driver);
	homeobject.opensinginlink();
	accountobject = new myaccount(driver);
	accountobject.usercanregister(email);
	registerobject = new Registerpage(driver);
registerobject.userdataregister(firstname, lasttname, password, city, postcode, mobile, adress2
			, adress1); 
	registerobject.selectstate();
	System.out.println("registration data :"+email+" "+password+" "+firstname+" "+lasttname+" "+city+" "
	+postcode+" "+mobile+" "+adress1+" "+adress2);
	Assert.assertEquals(driver.getCurrentUrl(), "http://automationpractice.com/index.php?controller=my-account");
	
}

}
