package com.wellQ.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	
	
	 By username =  By.id("usernameControl");
	 By password = By.id("passwordControl");
	 By submit = By.xpath("//input[@value='Log In']");
	 
	 public Login(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	 
	 
	 public void typeUserName()
	 {
		 driver.findElement(username).sendKeys("sfpmember");
	 }
	 
	 public void typePassword()
	 {
		 driver.findElement(password).sendKeys("sfpmember?");
	 }
	 
	 public void clickSubmitButton()
	 {
		driver.findElement(submit).click(); 
	 }
	 
	 

	
}
