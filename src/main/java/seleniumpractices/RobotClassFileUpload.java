package seleniumpractices;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RobotClassFileUpload {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_Layer")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userName= driver.findElement(By.xpath("(//div[@class='form-row']//input)[1]"));
		userName.isDisplayed();
		userName.sendKeys("vinothini.devi.k.l@gmail.com");
		WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Innova2020$");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		WebElement updateProfile=	driver.findElement(By.xpath("//div[@class='pendingActions']//following-sibling::div//div[@class='btn btn-block btn-large white-text' and text()='UPDATE PROFILE']"));
		System.out.println(updateProfile.isDisplayed());
		updateProfile.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement uploadBtn= driver.findElement(By.xpath("//a[@class='secondary-content']//preceding-sibling::span//following-sibling::a"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
//		wait.until(ExpectedConditions.elementToBeClickable(uploadBtn));
		System.out.println(uploadBtn.isDisplayed());
		uploadBtn.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5))
		
		Thread.sleep(5000);
		
		Robot robo = new Robot();
		
		StringSelection stringSelection  = new StringSelection("D:\\Learnings\\VinothiniDevi QA Automation Resume.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
	    
	    robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		 wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		
		
//		driver.quit();
		
		
	// 	Monster resume upload
	/*	driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();
	 	WebElement uploadResumeButton= driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']"));
		System.out.println(uploadResumeButton.isDisplayed());
		uploadResumeButton.click();
		
		Thread.sleep(5000);
		WebElement filetoUploadButton= driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", filetoUploadButton);
		System.out.println(filetoUploadButton.isEnabled());
	*/
		
		
		
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
//		wait.until(ExpectedConditions.elementToBeClickable(filetoUploadButton));
//		filetoUploadButton.click();
		
		
//		WebElement filetoUploadButton= driver.findElement(By.xpath("//p[@data-default-text='Drag & Drop file here']"));
//		System.out.println(filetoUploadButton.isDisplayed());
//		Thread.sleep(5000);
		
//		filetoUploadButton.click();
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='line-btn']"))).click();
		
//		Robot robo = new Robot();
//		
//		StringSelection stringSelection  = new StringSelection("D:\\Learnings\\Vino.txt");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
//	    
//		robo.keyPress(KeyEvent.VK_CONTROL);
//		robo.keyPress(KeyEvent.VK_V);
//		robo.keyRelease(KeyEvent.VK_V);
//		robo.keyRelease(KeyEvent.VK_CONTROL);
//		
//		Thread.sleep(3000);
//		
//		robo.keyPress(KeyEvent.VK_ENTER);
//		robo.keyRelease(KeyEvent.VK_ENTER);
		
		
		
//		WebElement elementButton =driver.findElement(By.xpath("//h5[text()='Elements']"));
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		je.executeScript("arguments[0].scrollIntoView(true);", elementButton);
//		elementButton.click();
		
//		WebElement uploadDownloadButton= driver.findElement(By.xpath("//span[text()='Upload and Download']"));
//		je.executeScript("arguments[0].scrollIntoView(true);", uploadDownloadButton);
//		uploadDownloadButton.click();
		
//		WebElement chooseFileButton= driver.findElement(By.id("uploadFile"));
//		chooseFileButton.sendKeys("D:\\Learnings\\Vino.txt");
		
//		Robot robo = new Robot();
		
//		StringSelection stringSelection  = new StringSelection("D:\\Learnings\\Vino.txt");
//	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);
		
	
	}

}
