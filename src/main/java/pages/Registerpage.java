package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registerpage extends PageBase {

	public Registerpage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id = "customer_firstname")
	WebElement firstnamebox;
	@FindBy(id = "customer_lastname")
	WebElement lastnamebox;
	@FindBy(id ="passwd" )
	WebElement passwdbox;
	@FindBy(id = "address1")
	WebElement addres;
	@FindBy(id = "city")
	WebElement citybox;
	@FindBy(id = "id_state")
	public WebElement statebox;
	@FindBy(id = "postcode")
	WebElement postcodebox;
	@FindBy(id = "id_country")
	public WebElement countarybox;
	@FindBy(id = "phone_mobile")
	WebElement mobilebox;
	@FindBy(id="alias")
	WebElement adressalia;
	@FindBy(id = "submitAccount")
	WebElement registerbutton;
	@FindBy(linkText = "Sign out")
	WebElement singoutlink;
	public void userdataregister(String firstname,String lasttname,String password,String city,
			String postcode,String mobile,String adress2,String adress1) 
	{
	
		settextelementtext(firstnamebox, firstname);
		settextelementtext(lastnamebox, lasttname);
		settextelementtext(passwdbox, password);
		settextelementtext(addres, adress1);
		settextelementtext(citybox, city);
		buttonclick(statebox);
		settextelementtext(postcodebox, postcode);
		settextelementtext(mobilebox, mobile);
		settextelementtext(adressalia, adress2);


	}


	public void selectstate() 
	{
		buttonclick(statebox);
		select = new Select(statebox);
		select.selectByIndex(1);
		buttonclick(registerbutton);
	}
	public void signout() 
	{
		buttonclick(singoutlink);
	}
}

