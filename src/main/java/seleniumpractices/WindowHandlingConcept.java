package seleniumpractices;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WindowHandlingConcept {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));// wait time for browser
		driver.manage().window().maximize();

		WebElement windowTile = driver.findElement(By.xpath("//h5[text() = 'Alerts, Frame & Windows']"));
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("arguments[0].scrollIntoView(true);", windowTile);
		driver.findElement(By.xpath("//h5[text() = 'Alerts, Frame & Windows']")).click();
		driver.findElement(By.xpath("//span[text() = 'Browser Windows']")).click(); /*Browser Click*/
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();

		//switch window using page title
		
		Set<String> switchWindow= driver.getWindowHandles();
		for(String each:switchWindow)
		{
			if(!each.equals(parentWindow))
			{
				System.out.println(driver.switchTo().window(each).getTitle());
			}
		}
		
	}

}
