package seleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {

	static WebDriver driver;
	static WebElement table;
	static int tableRows;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\LENOVO\\git\\VinothiniJavaProject\\drivers\\chromedriver_107.exe");
//				"C:/Users/prabu/git/VinothiniJavaProject/src/test/resources/drivers/chromedriver_107.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("file:///C:/Users/LENOVO/Desktop/webTable.html");
		driver.get("D:\\Learnings\\WebTable.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		table = driver.findElement(By.tagName("table"));
		// table[@name = 'Table']//tr
		tableRows = table.findElements(By.tagName("tr")).size();
		System.out.println(tableRows);

		// table[@name = 'Table']//tr[1]/th
		System.out.println("*************");
		System.out.println(driver.findElement(By.xpath("//table[@name = 'Table']//tr[1]/th")).getText());

		System.out.println("&&&&&&&&&&&&&&&&&");
		System.out.println(table.findElement(By.tagName("tr")).getText());

		System.out.println("11111111111111111");
//		getAllValuesFromARow(3);
//		validateGivenTextPresentInGivenRow(3, "Chandler");

//		getAllValuesFromARowUsingForEach(0);

		getAllRowIncludingHeaderRow(2);

//		List<WebElement> allRows = table.findElements(By.tagName("tr"));
//		for (WebElement eachRow : allRows) {
//
//			List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
//			for(WebElement eachHeader: allHeaders) {
//				System.out.println(eachHeader.getText());
//			}
//
//			List<WebElement> allData = eachRow.findElements(By.tagName("td"));
//			for (WebElement eachData : allData) {
//				System.out.println(eachData.getText());
//			}
//		}

	}

	public void getAllHeadersFromTable(WebElement tableElementName) {
		List<WebElement> allRows = tableElementName.findElements(By.tagName("tr"));
		for (WebElement eachRow : allRows) {
			List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
			for (WebElement eachHeader : allHeaders) {
				System.out.println(eachHeader.getText());
			}
		}
	}

	// https://www.geeksforgeeks.org/how-to-handle-dynamic-web-tables-using-selenium-webdriver-in-java/
	public static void getAllValuesFromARow(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < tableRows; i++) {
			if (i == row) {
				List<WebElement> allHeaders = rowText.get(i).findElements(By.tagName("td"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println(eachHeader.getText());
				}
			}
		}
	}

	public static void getAllValuesFromARowUsingForEach(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		int temp = 0;
		for (WebElement eachRow : rowText) {
			if (temp == row) {
				List<WebElement> allHeaders = eachRow.findElements(By.tagName("td"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println(eachHeader.getText());
				}
			}
			temp++;
		}
	}

	public static void getAllRowIncludingHeaderRow(int row) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		int temp = 0;
		for (WebElement eachRow : rowText) {
			if (temp == row && temp == 0) {
				List<WebElement> allHeaders = eachRow.findElements(By.tagName("th"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println("All Headers in table are " + eachHeader.getText());
				}
				break;
			}
			if (temp == row) {
				List<WebElement> allHeaders = eachRow.findElements(By.tagName("td"));
				for (WebElement eachHeader : allHeaders) {
					System.out.println(eachHeader.getText());
				}
			}
			temp++;
		}
	}

	public static void validateGivenTextPresentInGivenRow(int row, String text) {
		List<WebElement> rowText = driver.findElements(By.tagName("tr"));
		for (int i = 1; i < tableRows; i++) {
			if (i == row) {
				List<WebElement> allHeaders = rowText.get(i).findElements(By.tagName("td"));
				for (WebElement eachHeader : allHeaders) {
					if (eachHeader.getText().equalsIgnoreCase(text)) {
						System.out.println(eachHeader.getText());
					}
				}
			}
		}
	}
}
