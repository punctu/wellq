package com.wellQ.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wellQ.page_objects.Login;


public class validateLoginFunctionalityTest {

    public static WebDriver driver;
    String appUrl;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/mplesuvu/eclipse-workspace/wellq/src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        appUrl = "http:/devweb.yourwellq.com";
        
        
    }


   		@Test
    		public void validateLoginFunctionality() {

                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                com.wellQ.page_objects.Login login=new Login(driver);
        		driver.get(appUrl + "/");
        		
        		
        		//execute
        		login.typeUserName();
        		login.typePassword();
        		login.clickSubmitButton();
        		try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		
    			
        		//verify
        		
        		String expectedUrl = "https://devweb.yourwellq.com/member/dashboard";
        		Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        		
    	
    		}
   		
   		@AfterMethod
   		public void tearDown( ) {
   			driver.quit();
   		}
   		
}
	


