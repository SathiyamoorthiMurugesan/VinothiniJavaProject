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

public class WindowHandlingSeleniumDevSite {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));// wait time for browser
		driver.manage().window().maximize();
		
		
		String parentWindow= driver.getWindowHandle();
		driver.findElement(By.xpath("//div[@class='w-100 text-center']/a")).click();//learnmore button click
		
		Set<String> LearnMore =driver.getWindowHandles();
		for(String LearnMorePage : LearnMore)
		{
			if(!LearnMorePage.equals(parentWindow))
			{
				System.out.println(driver.switchTo().window(LearnMorePage).getTitle());
			}
		}
		
		}
		
		
}

