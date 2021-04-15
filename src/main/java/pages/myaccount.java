package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class myaccount extends PageBase {

	public myaccount(WebDriver driver) {
		super(driver);


	}
	@FindBy(id = "email_create")
	WebElement emailbox;
	@FindBy(id = "SubmitCreate")
	WebElement submitbutton;
	@FindBy(id = "email")
	WebElement emaillogin;
	@FindBy(id ="passwd" )
	WebElement passwordbox;
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
	WebElement submitlogin;
	@FindBy(linkText = "Sign out")
	WebElement singout;
	public void usercanregister(String email) 
	{
		settextelementtext(emailbox, email);
		buttonclick(submitbutton);
	}
	public void usercanlogin(String email,String password) 
	{
		settextelementtext(emaillogin, email);
		settextelementtext(passwordbox, password);
		buttonclick(submitbutton);
	}
	public void clicksubmit() 
	{
		buttonclick(submitlogin);
	}
	public void singout() 
	{
		buttonclick(singout);
	}

}
