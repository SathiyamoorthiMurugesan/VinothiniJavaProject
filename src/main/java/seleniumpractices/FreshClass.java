package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FreshClass {
			
			static WebDriver driver;
			static String vino="123";
			static int even,odd;
			
			public static void main(String[] args) {
				
				System.getProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver_107.exe");
				driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				
//				driver.findElement(By.xpath("//input[@name='email']")).sendKeys(vino);
////				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
////				driver.findElement(By.xpath("//button[@type='submit']")).click();

				
				int array[] = {1,4,6,9,12,3,45,67};
				int number;
			

				for (int i=0;i<array.length;i++)
				{
				if (array[i]%2==0) {
					even++;
				}
				else
					odd++;
				}
				System.out.println("Even count"+even);
				System.out.println("Odd count"+odd);
						}
			
			
}
