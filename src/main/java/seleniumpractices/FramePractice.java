package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePractice {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		WebElement windowTile = driver.findElement(By.xpath("//h5[text() = 'Alerts, Frame & Windows']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", windowTile);
		windowTile.click();
		driver.findElement(By.xpath("//div[@class='element-list collapse show']/ul/li[@id='item-2']")).click();
		
	
		
		//Frame
		driver.findElement(By.id("frame1"));
		driver.switchTo().frame(1);
	//	driver.findElement(By.xpath("(//h1[text()='This is a sample page'])"));
//		System.out.println(driver.findElement(By.xpath("(//h1[text()='This is a sample page'][2])")).getText());
		
	//driver.findElement(By.xpath("//span[@class='ns-iya5f-e-22']")).click();
	//	System.out.println(driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")));
	//	driver.findElement(By.xpath("//iframe[@id='frame1']")).click();
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//div[@class='ns-iya5f-e-5 banner-text-container clickable']"));
//		driver.switchTo().frame(1);
//		System.out.println(driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText());
		
		//span[@class='ns-iya5f-e-22']  - frame 1 button
		
	}

}

//driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
//
////JavascriptExecutor je = (JavascriptExecutor) driver;
////je.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//h1[contains(text(), 'HTML Dropdowns')]")));
//
//driver.findElement(By.id("iFrame")).click();
//Thread.sleep(5000);
//driver.switchTo().frame(0);
//driver.findElement(By.name("s")).click();;
//driver.findElement(By.name("s")).sendKeys("Hello");
////System.out.println(driver.findElement(By.xpath("//div[text() = '+91-9910979218' and @class = 'header_phone']")).getText());
//driver.switchTo().defaultContent();
//driver.findElement(By.id("Open New Window")).click();


