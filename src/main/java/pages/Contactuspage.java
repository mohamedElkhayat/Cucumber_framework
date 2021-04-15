package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Contactuspage extends PageBase {

	public Contactuspage(WebDriver driver) {
		super(driver);
		
	}
@FindBy(id = "id_contact")
WebElement Subject_Heading;
@FindBy(id = "email")
WebElement emailbox;
@FindBy(name = "id_order")
WebElement order_refrence;
@FindBy(id = "message")
WebElement massage_box;
@FindBy(id = "submitMessage")
WebElement send_button;
@FindBy(xpath = "//*[@id=\"center_column\"]/p")
public WebElement sucsseful_massage_send;
public void user_send_massage(String email,String refrence,String massage) 
{
	select = new Select(Subject_Heading);
	select.selectByVisibleText("Customer service");
	settextelementtext(emailbox, email);
	settextelementtext(order_refrence, refrence);
	settextelementtext(massage_box, massage);
	buttonclick(send_button);
	
}
}

