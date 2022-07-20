package org.cucu;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.test.BaseClass;
import org.test.Pompage;
import org.test.Registerclass;

import io.cucumber.java.en.*;

public class Loginpage extends BaseClass{
	Pompage p;
	Registerclass r;
	
@Given("To user should be in facebook login page")
public void to_user_should_be_in_facebook_login_page() {
	
//	WebDriverManager.chromedriver().setup();
//	WebDriver driver = new ChromeDriver();
	BrowserLaunch("chrome");
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
}



@When("To user has to fill {string} and {string}")
public void to_user_has_to_fill_and(String user, String pass) {
	 p=new Pompage();
	 r=new Registerclass();
	sendKeys(p.getUsername(), user);
     sendKeys(p.getPassword(), pass);
}

@When("The user has to click {string} button")
public void the_user_has_to_click_button(String button) {
	if(button.equals("login")) {
		buttonClick(p.getLoginbutton());
	}
	else if(button.equals("singup")) {
		buttonClick(r.getSingupbtn());
	}
	else {
		throw new NoSuchElementException();
	}
}
@Then("The user should navigate the invaild login page on the application")
public void the_user_should_navigate_the_invaild_login_page_on_the_application() throws InterruptedException {
	Thread.sleep(3000);
	System.out.println(driver.getCurrentUrl());
}

}
