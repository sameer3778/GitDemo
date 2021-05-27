package TestNg;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenShot 
{
	WebDriver driver;

	public void capture()
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		ts.getScreenshotAs(OutputType.FILE);
		
	}
}
