package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Product_page extends PageBase {

	public Product_page(WebDriver driver) {
		super(driver);
		
	}
@FindBy(linkText = "Send to a friend")
WebElement send_friend;
public void click_sendfriend() 
{
	buttonclick(send_friend);
}
}
