package FrameWorkPractice_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseCode {

	static WebDriver driver;
	
	@BeforeTest
	public static void WebDriverCall()
	{
		System.getProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
	}
	
	
}
