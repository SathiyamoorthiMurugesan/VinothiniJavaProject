package seleniumpractices;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandlingJavaTPointSite {

	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/java/default.asp");
		
		SwitchWindowusinggetTitle();
		// "W3Schools Tryit Editor")
	}
		// SwitchWindowusinggetTitle
	
		public static void SwitchWindowusinggetTitle(){
		String parentWindow= driver.getWindowHandle();
		WebElement TryitYourSelf = driver.findElement(By.xpath("//a[text()='Try it Yourself »' and @class='w3-btn']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,250)", "");
		driver.manage().window().maximize();
		TryitYourSelf.click();
		driver.findElement(By.xpath("//a[@id='getwebsitebtn' and @class='w3-button w3-bar-item w3-hover-white w3-hover-text-green w3-hide-small']")).click(); // Run Button
		
		Set<String> AllWindows = driver.getWindowHandles();
		for(String eachWindow :AllWindows)
		{ 
			if(eachWindow!=parentWindow) {
			driver.switchTo().window(eachWindow);
			}
		//	driver.findElement(By.xpath("//button[@id='runbtn']")).click();
			
		}
			
	    }

}


