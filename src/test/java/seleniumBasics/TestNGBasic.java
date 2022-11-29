package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasic {
	WebDriver driver;
	
	@Test
	public void testCase1() {
		System.out.println("I am @Test");
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Sathya08ece@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TestSathya@123");
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	
	@BeforeMethod
	public void launchBrowser() {
		System.out.println("I am @Before Method");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
