package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {
	
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crocs.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement womenTab = driver
				.findElement(By.xpath("//span[text() = 'Women' and @class = 'menuLink-title-J7d']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(womenTab).build().perform();
		
	
//		actions.contextClick(womenTab).build().perform();
		
		actions.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();

	}

	public void clickAnElementUsingActions(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
	}

}
