package seleniumpractices;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownHandle {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
		driver.manage().window().maximize();
				
		WebElement element = driver.findElement(By.xpath("//option[text()='Afghanistan']//parent::select"));
		Select s = new Select(element);
		s.selectByVisibleText("Canada");
//		Thread.sleep(5000);
		
//		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(8));
//		wait.until(ExpectedConditions.);
//		s.selectByVisibleText("Egypt");
		
	
		
			
		System.out.println(s.isMultiple());
		
	}
	}


