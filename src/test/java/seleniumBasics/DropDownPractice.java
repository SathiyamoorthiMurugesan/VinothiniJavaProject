package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement courseDropDown = driver.findElement(By.id("course"));
		courseDropDown.click();

		driver.findElement(By.xpath("//option[text() = 'Javascript']")).click();

		courseDropDown.click();

//		Thread.sleep(3000);
//
//		Select select = new Select(courseDropDown);
//
//		System.out.println(select.isMultiple());
//
//		select.selectByIndex(3);
//
//		Thread.sleep(3000);
//
//		select.selectByValue("net");
//
//		Thread.sleep(3000);
//
//		select.selectByVisibleText("Java");
//
//		List<WebElement> courseAllOptions = select.getOptions();
//		for (WebElement each : courseAllOptions) {
//			System.out.println(each.getText());
//		}

	}

	public void selectByValue(String value) {
		WebElement courseDropDown = driver.findElement(By.id("course"));
		Select select = new Select(courseDropDown);
		select.selectByValue(value);
	}

}
