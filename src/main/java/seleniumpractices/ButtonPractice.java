package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		WebElement w = driver.findElement(By.xpath("//h5[text()='Elements']"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", w);
		w.click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='menu-list']/li[5]")).click(); /* Button */
//      driver.wait(2000);

//		driver.findElement(By.xpath("//button[@type='button' and text()='Click Me']")).click(); /*click ME*/
//		driver.findElement(By.id("//p[@id='dynamicClickMessage']")); /*Display o/p*/

		// right Click me
		Actions action = new Actions(driver);
//		WebElement elementLocator1 = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
//		action.contextClick(elementLocator1).perform();

		// double click me
		WebElement elementLocator = driver.findElement(
				By.xpath("//button[@id='doubleClickBtn' and @type='button' and text()='Double Click Me']"));
		action.doubleClick(elementLocator).perform();
		WebElement elementFound = driver
				.findElement(By.xpath("//p[text()='You have done a double click' and @id ='doubleClickMessage']"));
		System.out.println(elementFound.getText());

	}
}
