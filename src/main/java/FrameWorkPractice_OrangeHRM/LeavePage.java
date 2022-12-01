package FrameWorkPractice_OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeavePage extends BaseCode{

	
	public LeavePage() {
          PageFactory.initElements(driver,this);
    }
	
	@FindBy(linkText = "Leave")
	WebElement leaveElement;
	
//	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-item' and text()='Apply']")
	@FindBy(linkText = "Apply")
	WebElement applyLeaveButton;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	WebElement leaveTypeDropDown;
	
	@FindBy(xpath="//div[text()='CAN - Bereavement']")
	WebElement CANBreavement;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement fromcalendar;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement tocalendar;
	
//	@FindBy(xpath="(//i[@class= 'oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
//	WebElement duration;
	
//	@FindBy(xpath="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'")
	@FindBy(className ="oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical")
	WebElement leaveComments;
	
//	@FindBy(xpath="//button[@type=\"submit\"]")
//	WebElement LeaveSubmitButton;
	
	public void ApplyLeave(int LeaveType,int DurationInDay) throws Exception
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(9000));
		wait.until(ExpectedConditions.elementToBeClickable(leaveElement));
		leaveElement.click();
		applyLeaveButton.click();
		leaveTypeDropDown.click();
		leaveTypeDropDown.sendKeys("c");
		leaveTypeDropDown.click();
		Thread.sleep(2000);
//		CANBreavement.click();
//		Select dropdown = new Select(LeaveTypeDropDown);
//		dropdown.selectByIndex(LeaveType);
		System.out.println(fromcalendar.isDisplayed());
//		Fromcalendar.click();
		tocalendar.sendKeys("2022-01-20");
		fromcalendar.sendKeys("2022-01-20");
//		Select dropdown1 = new Select(duration);
//		dropdown1.selectByIndex(DurationInDay);
//		leaveComments.sendKeys("New BL requested");
//		LeaveSubmitButton.click();
	}
	
	

	
	
	
	
	
	
}
