package Simple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OpenBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenuim\\Software\\ChromeDriver\\v900_4430_24\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_dropdown_navbar_click");
		
	List<WebElement> li=	driver.findElements(By.tagName("iframe"));
		// driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		System.out.println(li.size());
		

		
		

	}

}
