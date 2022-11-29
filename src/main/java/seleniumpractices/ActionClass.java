package seleniumpractices;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass{
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		Actions action= new Actions(driver); 
		driver.get("https://www.crocs.in/");
		driver.manage().window().maximize();
		
		
		//Crocs
		WebElement kids  = driver.findElement(By.xpath("//span[@class='menuLink-title-J7d' and text()='Kids']"));
		//action.contextClick(BoyFashion).moveToElement(BoyFashion).sendKeys(Keys.DOWN).build().perform();
		WebElement boyClogs = driver.findElement(By.xpath("//a[contains(@href,'kids-shoes/boys/style/clogs') and @tabindex='0']"));
		action.moveToElement(kids).build().perform();
		Thread.sleep(2000);
		action.moveToElement(boyClogs);
		Thread.sleep(2000);
		action.click().build().perform();
		// WebElement shopByCollection= driver.findElement(By.xpath("//div[@class='option-container submenu1-1']/ul/li[@class='shopchoic spacedown']/a[@title='SHOP BY COLLECTION']"));
		
		//action.scrollToElement().build().perform();
	//	action.doubleClick(babyEssentials).build().perform();
		
		
		
//		action.sendKeys(Keys.TAB).sendKeys(Keys.ESCAPE).build().perform();
//		WebElement womenTab = driver.findElement(By.xpath("//span[@class='menuLink-title-J7d' and text()='Women']"));
//		action.contextClick(womenTab).sendKeys(Keys.ENTER).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	
	
//		sendKeys(Keys.ARROW_DOWN,Keys.RETURN).build().perform();
//		
//		action.moveToElement(driver.findElement(By.xpath("//span[@class='menuLink-title-J7d' and text()='Women']")).
//	  	actions.contextClick(WomenTab).sendKeys(Keys.ARROW_DOWN,Keys.ENTER).build().perform();
	
		
	}

	WebDriverWait wait;
	
	
}
