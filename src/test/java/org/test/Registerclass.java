package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerclass extends BaseClass{
	
	public Registerclass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement creataccountbtn;
	@FindBy(name="firstname")
	private WebElement firstname;
	@FindBy(name="lastname")
	private WebElement lastname;
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement Phonenumber;	
	@FindBy(xpath="(//button[text()='Sign Up'])[1]")
	private WebElement singupbtn;
	
	public WebElement getCreataccountbtn() {
		return creataccountbtn;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPhonenumber() {
		return Phonenumber;
	}
	public WebElement getSingupbtn() {
		return singupbtn;
	}
	
	
}
