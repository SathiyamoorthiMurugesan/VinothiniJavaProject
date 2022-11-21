package seleniumpractices;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice1 {

	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));// wait time for browser
	    driver.manage().window().maximize();
		String TitleOfPage = driver.getTitle();
		System.out.println("TitleOfPage: " + TitleOfPage);
		// driver.close();
		String curUrl = driver.getCurrentUrl();
		System.out.println("Current Url: " + curUrl);
		System.out.println(driver.getWindowHandle());

		WebElement elementPath = driver.findElement(By.xpath("//h5[text()='Elements']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", elementPath);
		elementPath.click();
	//	driver.manage().window().maximize();

		WebElement TextBox = driver.findElement(By.xpath("//span[text()='Text Box']"));
		TextBox.click();
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		FullName.sendKeys("Vinothini");		

		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("vino123@abc.com");		
		WebElement CurrentAddress= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CurrentAddress.sendKeys("Dont mail for this address");
		WebElement permanentAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		permanentAddress.sendKeys("new mount address Kodaikanal");
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("arguments[0].scrollIntoView(true);",permanentAddress);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	//	System.out.println(driver.findElement(By.xpath("//div[@id='output']/div/p[1]")).getText());
		
		List<WebElement> allDetails = driver.findElements(By.xpath("//div[@id='output']/div/p"));
		for(WebElement each: allDetails) {
			System.out.println(each.getText());
		}
		
		WebElement fullAddress1 = driver.findElement(By.id("output"));
		System.out.println(fullAddress1.findElement(By.tagName("p")).getText());
		
		List<WebElement> fullDetails2 = fullAddress1.findElements(By.tagName("p"));
		for(WebElement each: fullDetails2) {
			System.out.println(each.getText());
		}
		
// 		driver.close();
		
					
//		System.out.println("You have selected" + driver.findElement(By.className("text-success")).getText());
	//	driver.findElement(By.xpath("//p[@id='name' and @class = 'mb-1']")).isDisplayed();
		

		// radio button
//		driver.findElement(By.xpath("//span[contains(text(),'Radio Button')]")).click();
//		doYouLikeSite1("Impressive");
//		
//		CALL ME - NOT CONNECTING - ONE MIN OKAY i CAN HEAR YOU. CAN YOU?
//		I CANT HEAR YOU. CALL ME BACK
//
//	}
//
//	public static void doYouLikeSiteYes() {
//		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
//		System.out.println("You have selected" + driver.findElement(By.className("text-success")).getText());
//	}
//
//	public static void doYouLikeSiteImpressive() {
//		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
//		System.out.println("You have selected" + driver.findElement(By.className("text-success")).getText());
//	}
//
//	public static void doYouLikeSite(String yesOrImpressive) {
//		switch (yesOrImpressive) {
//		case "Yes":
////			doYouLikeSiteYes();
//			driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
//			break;
//		case "Impressive":
////			doYouLikeSiteImpressive();
//			driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
//			break;
//		}
//		System.out.println("You have selected " + driver.findElement(By.className("text-success")).getText());
//	}
//
//	public static void doYouLikeSite1(String yesOrImpressive) {
//		if (yesOrImpressive.equalsIgnoreCase("Yes")) {
//			driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
//		}
//		if (yesOrImpressive.equalsIgnoreCase("Impressive")) {
//			driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
//		}
//		System.out.println("You have selected " + driver.findElement(By.className("text-success")).getText());
	}
	
//	get window handle of current window and store it in a variable
//	click or do something, so that, new window will open
//	Now get all window handles 
//	Iterate all window handles and switch only when each window is not parent window
	
//	driver.manage().switchTo().window();
	
	
}
