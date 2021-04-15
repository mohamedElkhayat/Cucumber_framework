package utilites;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	public static void capturescreenshot(WebDriver driver,String screenshotname) 
	{
		Path deat = Paths.get("./screenshot",screenshotname+".png");
		try {
			Files.createDirectories(deat.getParent());
			FileOutputStream out = new FileOutputStream(deat.toString());
			out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("exception while take screenshot"+e.getMessage());
		}

	}

}
