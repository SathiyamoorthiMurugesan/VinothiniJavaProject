package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonPractice {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		System.setProperty("Webdriver.chrome.driver","./src/test/resources/drivers/chromedriver_107.exe");
		 driver= new ChromeDriver();
		 driver.get("https://demoqa.com/");	
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 radioButtonClick();	 
	}

	public static void radioButtonClick() throws Exception
	{
		WebElement elements = driver.findElement(By.xpath("//h5[text()='Elements']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true); ",elements);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(elements.isDisplayed());
		elements.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//span[text()='Radio Button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println("*****Radio Button page******");
		WebElement yesRadioButton = driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='yesRadio']"));
		WebElement impressiveRadioButton=driver.findElement(By.xpath("//label[@class='custom-control-label' and @for='impressiveRadio']"));
		impressiveRadioButton.click();
		WebElement getText = driver.findElement(By.xpath("//p[text()='You have selected ']"));
		
		System.out.println("Radio selection result here" +getText.getText());	
				
	
		
		
	}
	
}
