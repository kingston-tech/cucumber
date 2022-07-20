package org.cucu;

import org.openqa.selenium.WebElement;
import org.test.BaseClass;
import org.test.Registerclass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registerpage extends BaseClass {
	Registerclass r;

	@When("To user has to fill {string} , {string} , {string}")
	public void to_user_has_to_fill(String firstname, String secname, String phone) {
		r = new Registerclass();
		buttonClick(r.getCreataccountbtn());
		sendKeys(r.getFirstname(), firstname);
		sendKeys(r.getLastname(), secname);
		sendKeys(r.getPhonenumber(), phone);
		// assertFalse(driver.getCurrentUrl().contains("face"));
		// assert.assertTrue();

	}

	@Then("The user should navigate the invaild login page")
	public void the_user_should_navigate_the_invaild_login_page() throws InterruptedException {
		Thread.sleep(4000);
		buttonClick(r.getSingupbtn());
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
	//	quit();
	}


}
