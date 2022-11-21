package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxPractice {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		WebElement elementPath = driver.findElement(By.xpath("//h5[text()='Elements']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", elementPath);
		elementPath.click();

		driver.findElement(By.xpath("//span[text()='Check Box']")).click(); // CheckBox Button click
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click(); /*Expand*/
		driver.findElement(By.xpath("//label[@for='tree-node-office']/span[@class='rct-checkbox']")).click(); /*select  Office checkBox*/
		System.out.println(driver.findElement(By.xpath("//div[@class='display-result mt-4']")).getText());
		driver.findElement(By.xpath("//label[@for='tree-node-react']/span[@class='rct-checkbox']")).click();// select react checkbox specifically
		System.out.println(driver.findElement(By.xpath("//div[@class='display-result mt-4']")).getText());
		//	driver.findElement(By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']")).click(); /* Check home checkBox */
		//	driver.findElement(By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']")).click(); /* unCheck home checkBox */
		driver.findElement(By.xpath("//label[@for='tree-node-home']/span[@class='rct-checkbox']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='display-result mt-4']")).getText());
}

	// Expand
	public static void checkBoxtoExpand() {
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-expand-all']")).click();
	}

	// collapse
	public static void checkBoxtoCollapse() {
		driver.findElement(By.xpath("//button[@class='rct-option rct-option-collapse-all']")).click();
	}

	// print all selected WebElements
	public static void PrintWebElements() {
		System.out.println(driver.findElement(By.xpath("//div[@class='display-result mt-4']")).getText());
	}

	// driver.findElement(By.xpath("//button[@class='rct-option
	// rct-option-collapse-all']")).click();
	// driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	// driver.findElement(By.xpath("//span[text()='Downloads']")).click();

	// driver.findElement(By.xpath("//button[@class='rct-collapse
	// rct-collapse-btn']")).click();//Home dropdown check
	// driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));

	// driver.findElement(By.xpath("//li[@class ='rct-node rct-node-parent
	// rct-node-expanded']")).click();
	// driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
	// //click on home checkbox so display all elements

}
