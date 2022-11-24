package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.out.println(System.getProperty("user.dir"));
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir")+"\\drivers\\chromedriver_107.exe");
		System.setProperty("webdriver.chrome.driver",
				".\\drivers\\chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/uploadAFile.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		driver.findElement(By.id("fileToUpload")).sendKeys("D:\\sathiya\\Text123.txt");
		
		System.out.println(driver.findElement(By.id("fileToUpload")).isEnabled());
//		driver.findElement(By.name("fileToUpload")).click();
//		driver.findElement(By.xpath("//input[@type='file']")).click();
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("fileToUpload"))).click().build().perform();
		
//		Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//		wait.withTimeout(Duration.ofSeconds(3));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		Robot robo = new Robot();

		StringSelection stringSelection = new StringSelection("D:\\sathiya\\Text123.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(3000);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
