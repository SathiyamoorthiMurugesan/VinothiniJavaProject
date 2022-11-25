package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("D:\\Learnings\\WebTable.html");
		
		WebElement table = driver.findElement(By.name("Table"));
		
		int Rowsize = table.findElements(By.tagName("tr")).size();
		System.out.println(Rowsize);
		
		int ColSize = table.findElements(By.tagName("th")).size();
		System.out.println(ColSize);
		
		System.out.println("*********Header TH3 print***********");
	
		System.out.println(driver.findElement(By.xpath("//table[@name='Table']//tr[1]/th[3]")).getText());
		
		System.out.println("&&&&&&&&&&&&hello data and headers&&&&&&&&&&");
		List<WebElement> allHeaders = table.findElements(By.tagName("tr[2]"));
		for(WebElement eachHeader :allHeaders){ 
			System.out.println(eachHeader.getText());
		}
		System.out.println("4444$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$4444");
		getAllValuesFromARow(table);
	}
	
	public static void getAllValuesFromARow(WebElement table) {
		
		List<WebElement> allHeaders = table.findElements(By.tagName("td"));
		for(WebElement eachHeader :allHeaders){ 
			if(eachHeader.equals("C"))
			System.out.println(eachHeader.getText());
		}
	}
	
	
	public void validateGivenTextPresentInGivenRow(int row) {
		
	}

}
