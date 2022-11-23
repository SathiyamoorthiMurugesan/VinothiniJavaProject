package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='information closable']//following-sibling::p/select"));
		
		
		Select select = new Select(element);
		//select.selectByIndex(7);
		element.click();
		select.selectByVisibleText("Antigua and Barbuda");
		select.getAllSelectedOptions();
		
		Thread.sleep(4000);
		System.out.println(select.isMultiple());
		
	}
	}


