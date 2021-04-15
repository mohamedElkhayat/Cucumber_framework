package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.Helper;

public class TestBase extends AbstractTestNGCucumberTests {
	public static WebDriver driver;
	@BeforeMethod
	@Parameters("brawser")
	public static void startdriver(@Optional("chrome") String brawsername)   
	{
		if (brawsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (brawsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
		}
		else if (brawsername.equalsIgnoreCase("edge")) {
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	@AfterSuite
	public void closedriver() 
	{
		driver.quit();
	}
	@AfterMethod
	public void screenshot_on_failuar(ITestResult result) 
	{
		if (result.getStatus()==ITestResult.FAILURE) 
		{
			System.out.print("failuar");
			System.out.print("taking screenshot......");
			Helper.capturescreenshot(driver,result.getName());
		}
	
	}
}

