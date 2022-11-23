package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageUsingWebDriver {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[@aria-label='No thanks']")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.className("gLFyf")).sendKeys("javatpoint tutorials");
		driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']")).submit();
	}

}
