package seleniumpractices;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngPractice {

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.findElement(By.id("email")).sendKeys("Sathya08ece@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TestSathya@123");
		driver.findElement(By.name("login")).click();
}
	
}
