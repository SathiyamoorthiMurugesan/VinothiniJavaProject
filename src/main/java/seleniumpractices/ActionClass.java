package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass{
	
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		Actions actions= new Actions(driver); 
		driver.get("https://www.crocs.in/");
		driver.manage().window().maximize();
			
//		Crocs
		WebElement crocsPurpose = driver.findElement(By.xpath("//a[text()='Learn More']"));
		WebElement womenTab = driver.findElement(By.xpath("//span[@class='menuLink-title-J7d' and text()='Women']"));
//		WebElement kids  = driver.findElement(By.xpath("//span[@class='menuLink-title-J7d' and text()='Kids']"));
//		WebElement boyClogs = driver.findElement(By.xpath("//a[contains(@href,'kids-shoes/boys/style/clogs') and @tabindex='0']"));
//		action.moveToElement(kids).build().perform();
//		Thread.sleep(2000);
//		action.moveToElement(boyClogs).click().build().perform();
//		Thread.sleep(2000);
		actions.scrollToElement(crocsPurpose);
//		action.moveToElement(womenTab).build().perform();
		actions.contextClick(womenTab).keyDown(Keys.CONTROL ).keyUp(Keys.CONTROL).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();

	
	
//		WebElement shopByCollection= driver.findElement(By.xpath("//div[@class='option-container submenu1-1']/ul/li[@class='shopchoic spacedown']/a[@title='SHOP BY COLLECTION']"));
//		actions.moveToElement(crocsPurpose);

	
//	public static void moveToElementsTab(WebElement ele)
//	{
//		
//	}

	
		
	

	WebDriverWait wait;
	}
	
	
}
