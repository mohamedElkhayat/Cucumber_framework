package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;


public class Homepage extends PageBase{

	public Homepage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
		jse = (JavascriptExecutor) driver;
	}
@FindBy(linkText = "Sign in")
WebElement signinlink;
@FindBy(id = "search_query_top")
WebElement searchbox;
@FindBy(name = "submit_search")
WebElement submitbutton;
public void opensinginlink() 
{
	buttonclick(signinlink);
}
public void usersearch(String productname) 
{
	settextelementtext(searchbox, productname);
	buttonclick(submitbutton);
}
@FindBy(linkText = "Contact us")
WebElement contactuslink;
public void click_contactus() 
{
	buttonclick(contactuslink);
}
@FindBy(id = "search_query_top")
WebElement search_box;
@FindBy(name = "submit_search")
WebElement search_button;
public void user_search(String word) 
{
	settextelementtext(searchbox, word);
}
public void user_click_search() 
{
	buttonclick(search_button);
}
@FindBy(linkText = "Blouse")
WebElement product_name;

public void open_product() 
{
	scrolldown();
	action.moveToElement(product_name).build().perform();
	buttonclick(product_name);
}
}
