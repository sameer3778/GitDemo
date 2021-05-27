package Simple;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeScope {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenuim\\Software\\ChromeDriver\\v900_4430_24\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println("Total number of links on whole page is: " + driver.findElements(By.tagName("a")).size());

		// limit the scope of driver:
		WebElement footer = driver.findElement(By.xpath("//div[@id = 'gf-BIG']"));

		System.out
				.println("number of web element in footer scection is: " + footer.findElements(By.tagName("a")).size());

		// find out links present in discount coupons

		List<WebElement> arr = driver.findElements(By.xpath("//div[@id = 'gf-BIG']/table/tbody/tr/td"));
		System.out.println("number of col are: " + arr.size());

		WebElement dis = driver.findElement(By.xpath("//div[@id = 'gf-BIG']/table/tbody/tr/td[1]/ul"));

		System.out.println("coupn elentare: " + dis.findElements(By.tagName("a")).size());

		for (int i = 1; i < dis.findElements(By.tagName("a")).size(); i++) {
			String keysPass = Keys.chord(Keys.CONTROL, Keys.ENTER); // open the link on new tab
			dis.findElements(By.tagName("a")).get(i).sendKeys(keysPass);

		}
		System.out.println("total window are: " + driver.getWindowHandles().size());

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> it = windows.iterator();
		int k = 0;
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("Title of window number " + k + " is----->  " + driver.getTitle());
			k++;
		}

	}

}
