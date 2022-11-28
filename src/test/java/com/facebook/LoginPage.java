package com.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
//	WebElement userId = driver.findElement(By.id(""));
	@FindBy(id = "email")
	WebElement userId;
	
	@FindBy(id = "pass")
	WebElement pass;
	
	@FindBy(name = "login")
	WebElement loginButton;
	
	@FindBy(linkText = "Forgotten password?")
	WebElement ForgottenPasswordLink;
	
	@FindBy(xpath = "//a[@data-testid = 'open-registration-form-button']")
	WebElement createNewAccountLink;
	
	@FindBy(xpath = "//div[text() = 'Add Account']")
	WebElement addAccountLink;
	
	@FindBy(xpath = "//div[text() = 'Add Account']/preceding-sibling::div/i")
	WebElement addAccountPlusButton;
	
	@FindBy(linkText = "Create a Page")
	WebElement creatAPageLink;
	
	@FindBy(xpath = "//div[text() = 'Sign Up']")
	WebElement createNewAccount_SignUpText;
	
	@FindBy(xpath = "//div[contains(text(), 'quick and easy.')]")
	WebElement createNewAccount_QuickAndEasyText;
	
	@FindBy(name = "firstname")
	WebElement createNewAccount_FirstName;
	
	@FindBy(name = "lastname")
	WebElement createNewAccount_SurName;
	
	@FindBy(name = "reg_email__")
	WebElement createNewAccount_EmailOrPhone;
	
	@FindBy(id = "password_step_input")
	WebElement createNewAccount_NewPassword;
	
	@FindBy(id = "day")
	WebElement createNewAccount_DOB_Day;
	
	@FindBy(id = "month")
	WebElement createNewAccount_DOB_Month;
	
	@FindBy(id = "year")
	WebElement createNewAccount_DOB_Year;
	
	@FindBy(xpath = "//label[text() = 'Female']")
	WebElement createNewAccount_Gender_Female;
	
	@FindBy(xpath = "//label[text() = 'Male']")
	WebElement createNewAccount_Gender_Male;
	
	@FindBy(xpath = "//label[text() = 'Custom']")
	WebElement createNewAccount_Gender_Custom;
	
	@FindBy(name = "preferred_pronoun")
	WebElement createNewAccount_CustomGender_Pronoun;
	
	@FindBy(name = "custom_gender")
	WebElement createNewAccount_CustomGender_Text;
	
	@FindBy(name = "websubmit")
	WebElement createNewAccount_Submit;
	
	
	
	
	
	
	public void loginFacebook(String userID, String password) {
		userId.sendKeys(userID);
		pass.sendKeys(password);
		loginButton.click();
	}
	
	public void createNewAccount(String firstName, String surName, String emailOrPhone, String password, String DOB, String gender) {
		createNewAccount_FirstName.sendKeys(firstName);
		createNewAccount_SurName.sendKeys(surName);
		createNewAccount_EmailOrPhone.sendKeys(emailOrPhone);
		createNewAccount_NewPassword.sendKeys(password);
//		DOB = 20102020;
//		DOB = 20/10/2020;
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
