package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		FirefoxDriver driver1 = new FirefoxDriver();
//		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println(driver.getTitle());
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		System.out.println(driver.getWindowHandle());
//		CDwindow-5F1CA225F06ACB8FC7F1BF3149B579F1
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		
		boolean elementIsDisplayed = driver.findElement(By.xpath("//h5[text() = 'Elements']")).isDisplayed();
		System.out.println(elementIsDisplayed);
		
//		driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h5[text() = 'Elements']")));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//h5[text() = 'Elements']")).click();
		
		driver.close();
		
		
		
	}

}
