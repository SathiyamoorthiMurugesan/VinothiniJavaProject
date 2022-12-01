package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreshClass {
			
			static WebDriver driver;
			static String vino="123";
			
			public static void main(String[] args) {
				
				System.getProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver_107.exe");
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys(vino);
//				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//				driver.findElement(By.xpath("//button[@type='submit']")).click();
//	
				}

}
