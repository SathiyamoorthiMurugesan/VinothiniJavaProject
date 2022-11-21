package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebElement MainWindowTile = driver.findElement(By.xpath("//h5[text() = 'Alerts, Frame & Windows']"));
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("arguments[0].scrollIntoView(true);", MainWindowTile);
		MainWindowTile.click();
		driver.findElement(By.xpath("//span[@class='text' and text()='Alerts']")).click();
		Thread.sleep(1000);
		
		
		// First Alert
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); 
		
		//Timing Alert
		driver.findElement(By.xpath("//button[@id='timerAlertButton' and @class='btn btn-primary']")).click();
		Thread.sleep(8000);
		driver.switchTo().alert().accept();
		
		
		//Confirmation Alert
		WebElement ConfirmMessage= driver.findElement(By.xpath("//button[@id='confirmButton' and @class='btn btn-primary']"));
		ConfirmMessage.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		WebElement ConfirmResultText = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(ConfirmResultText.getText());
	
		//Prompt Alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Hello welcome to ToolsQA site");
		driver.switchTo().alert().accept();
		WebElement ConfirmResult= driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(ConfirmResult.getText());

	}

}
