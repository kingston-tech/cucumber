package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class Pompage extends BaseClass{
	
	public Pompage() {
		PageFactory.initElements(driver, this);
	}
    @FindBy(id="email")
	private WebElement username;
    @FindBy(id="pass")
	private WebElement password;
    @FindBy(name="login")
	private WebElement loginbutton;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return loginbutton;
	}
}
