   package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Send_friend_page extends PageBase {

	public Send_friend_page(WebDriver driver) {
		super(driver);
		
	}
@FindBy(id = "friend_name")
WebElement name_friend;
@FindBy(id = "friend_email")
WebElement email_friend;
@FindBy(id="sendEmail")
WebElement send;
@FindBy(css="div.fancybox-inner")
public WebElement sucsseful_massage;
public void user_send_to_friend(String name ,String email) 
{
	settextelementtext(name_friend, name);
	settextelementtext(email_friend, email);
	buttonclick(send);
}
}
