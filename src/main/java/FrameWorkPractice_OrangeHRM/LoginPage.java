package FrameWorkPractice_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseCode{

//	static WebDriver driver;
	static String usrname = "Admin";

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement LoginUsername;

	@FindBy(name = "password")
	WebElement LoginPassword;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement SubmitButton;

	public void loginOrangeHRM() {
		LoginUsername.sendKeys("Admin");
		LoginPassword.sendKeys("admin123");
		SubmitButton.submit();
	}
	
	//just for reference main method
	
	public static void main(String[] args) throws Exception {
		
		System.getProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement leaveTab= driver.findElement(By.linkText("Leave"));
		leaveTab.click();	
	}
}
