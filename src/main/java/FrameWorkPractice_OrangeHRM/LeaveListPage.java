package FrameWorkPractice_OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LeaveListPage extends BaseCode{
	
	
	public LeaveListPage() {
        PageFactory.initElements(driver,this);
    }

	@FindBy(xpath="//a[text()='Leave List']")
	WebElement LeaveList;
	
	@FindBy(xpath= "//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")
	WebElement FromDateLeaveList;
	
	@FindBy(xpath= "//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")
	WebElement ToDateLeaveList;
	
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")
    WebElement LeaveListLeaveStatus;
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
	WebElement LeaveListLeavetype;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	WebElement EmployeeName;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement SearchforLeaveList;
	
	@FindBy(xpath="//button[@type='reset']")
	WebElement ResetList;
	
	
	public void LeaveListForEmployee(String EmpName)
	{
		LeaveList.click();
		FromDateLeaveList.sendKeys("01-30-2022");
		ToDateLeaveList.sendKeys("02-01-2022");
		Select dropdown = new Select(LeaveListLeaveStatus);
		dropdown.selectByIndex(2);
		Select dropdown1 = new Select(LeaveListLeavetype);
		dropdown1.selectByIndex(1);
		EmployeeName.sendKeys(EmpName);
	}
	public void pullLeaveListforSpecificDate(String toDateLL,String fromDateLL,String leaveStatus)
	{
	    LeaveList.click();
		FromDateLeaveList.sendKeys(fromDateLL);
		ToDateLeaveList.sendKeys(toDateLL);
		Select dropdown = new Select(LeaveListLeaveStatus);
		dropdown.selectByValue(leaveStatus);
	}
	
	public void ResetLeaveList()
	{
		ResetList.click();
	}
	
}
