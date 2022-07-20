package org.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 public static WebDriver driver;
	   // public static WebDriver browserLanch() {
	//
	//   WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		return driver;
	//}
	   public static void BrowserLaunch(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			}
		else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			}
		
			}
		//urllanch
	   public static void urlLaunch(String url) {
			driver.get(url);
			driver.manage().window().maximize();

		}
		   
		//wait
	   public static void ImplicitlyWait(long time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}
		//getCurrenturl
		
	   public static String getCurrentUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;

		}
		//gettitle
		
	   public static String getTitle() {
			String title = driver.getTitle();
			return title;

		}
	//quit
	   public static void quit() {
		driver.quit();
	}   
		//sendkeys
	   public static void sendKeys(WebElement e,String Value) {
		e.sendKeys(Value);

	}
		//DragandDrop
		
	   public static void DragAndDrop(WebElement scr,WebElement des) {
	     Actions a=new Actions(driver);
	     a.dragAndDrop(scr, des);
		}
	//selectByIndex
	   public static void selectByIndex(WebElement e,int value) {
	Select s=new Select(e);
	s.selectByIndex(value);

	}
	   //selectByValue
	   public static void selectByValue(WebElement e,String value) {
	  Select s=new Select(e);
	  s.selectByValue(value);
	  
	}
	   //selectByvalueText
	   public static void selectByVisibleText(WebElement e,String value) {
	          Select s = new Select(e);
	          s.selectByVisibleText(value);
	}
	   
	   
	   //click
	   public static void buttonClick(WebElement e) {
	   e.click();

	}
	   //gettext
	   public static String getText(WebElement e) {
		String text = e.getText();
		return text;
	}
	   //getAttribute
	   public static String getAttribute(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;
	} 
	   //action
	   //MoveToElement
	   public static void moveToElement(WebElement e) {
	   Actions a =new Actions(driver);
	a.moveToElement(e).perform();

	}

	//deSelect   
	   public static void deselectByIndex(WebElement e,String Value) {
		Select s=new Select(e);
	  s.deselectByValue(Value);
	}
	   //findElement
	   public static WebElement findElement(String locatorName,String locatorValue) {
	    WebElement value = null;
		if(locatorName.equals("id")) {
			  value = driver.findElement(By.id(locatorName));
		}
		else if(locatorName.equals("name")) {
			 value = driver.findElement(By.name(locatorValue));
			 
		}
		
		else if(locatorName.equals("xpath")) {
			 value = driver.findElement(By.xpath(locatorValue));
		}
		return value;
		
		
	   }
		//Screenshot
		public static void getScreenshotAs(String name) throws IOException {
			TakesScreenshot tk=(TakesScreenshot)driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File des =new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenNew\\src\\test\\resources"+name+".png");
			FileUtils.copyFile(src, des);
			
		}
		
		//js
		public static void JavascriptExecutor(WebElement e,String name) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].setAttribute('value')", e);
		}
		
		//getAttribute
		public static String jsGetAttribute(WebElement e) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			Object obj = js.executeScript("return argument[0].getAttribute('value'", e);
			String atUser = obj.toString();
			return atUser;
	        
		}
		
	   
	   
	   
	   
	   
	   
	   
	}



