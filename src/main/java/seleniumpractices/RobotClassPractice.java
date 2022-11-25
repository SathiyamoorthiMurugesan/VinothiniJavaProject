package seleniumpractices;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassPractice {

	static WebDriver driver;
	static Robot robo;

	public static void main(String[] args) throws Exception {

		driver = new ChromeDriver();
		robo = new Robot();
		driver.get("https://www.firstcry.com/");
		driver.manage().window().maximize();

	}

	public static void RobotClassAllMethodsImplementation() {
		WebElement BoyFashion = driver.findElement(By.xpath("//span[@id='menu1']/preceding-sibling::a"));
		WebElement babyEssentials = driver.findElement(
				By.xpath("//a[@title='Baby Essentials' and @class='M13_75']/parent::li[@class=' hborder ']/a"));
		WebElement shopByCollection = driver.findElement(By.xpath(
				"//div[@class='option-container submenu1-1']/ul/li[@class='shopchoic spacedown']/a[@title='SHOP BY COLLECTION']"));
		
//		robo.keyPress(KeyEvent.KEY_FIRST));
	}

}
