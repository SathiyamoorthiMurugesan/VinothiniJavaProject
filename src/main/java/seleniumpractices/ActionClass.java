package seleniumpractices;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass{
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		Actions action= new Actions(driver); 
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();
		
		
		//First cry
		WebElement BoyFashion = driver.findElement(By.xpath("//span[@id='menu1']/preceding-sibling::a"));
		//action.contextClick(BoyFashion).moveToElement(BoyFashion).sendKeys(Keys.DOWN).build().perform();
		WebElement babyEssentials = driver.findElement(By.xpath(
				"//a[@title='Baby Essentials' and @class='M13_75']/parent::li[@class=' hborder ']/a"));
		action.moveToElement(BoyFashion).build().perform();
		WebElement shopByCollection= driver.findElement(By.xpath("//div[@class='option-container submenu1-1']/ul/li[@class='shopchoic spacedown']/a[@title='SHOP BY COLLECTION']"));
		action.moveToElement(babyEssentials).click().build().perform();
		
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

}
