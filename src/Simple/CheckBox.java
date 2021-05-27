package Simple;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenuim\\Software\\ChromeDriver\\v900_4430_24\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	List<WebElement> li=	driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	for(int i=0; i<li.size();i++)
	{
		//if(li.get(i).getText())
		li.get(i).click();
	}
	}

}
