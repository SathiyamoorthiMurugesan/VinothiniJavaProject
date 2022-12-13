package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prabu\\git\\VinothiniJavaProject\\src\\test\\resources\\drivers\\chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.crocs.in/");
		driver.get("https://www.edureka.co/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		WebElement womenTab = driver.findElement(By.xpath("//span[text() = 'Women' and @class = 'menuLink-title-J7d']"));

		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		WebElement searchResults = driver.findElement(By.xpath("//span[@id='search-box']//input[@id='search-input']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", searchResults);
		searchResults.click();
		
//		searchResults.click();
//		actions.sendKeys(searchResults,"Selenium Training").build().perform();
//		actions.sendKeys("Vino");
		
		
		
//		actions.moveToElement(womenTab).build().perform();	
//		actions.contextClick(womenTab).build().perform();
//		
//		actions.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	}

	public void clickAnElementUsingActions(WebElement ele) {
		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
	}
	

}
