package com.packt.webdriver.chapter1;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.testselenium2014.tests.pageobjects.LoginPage;



public class NavigateToAUrl {
	public static void main(String[] args){
		
		
		WebDriver driver = new FirefoxDriver();
		
		//login to site
		LoginPage lgnPage = new LoginPage(driver);
                lgnPage.login("testselenium2014", "velosiped");
		
		//verify that we see dashboad
		WebElement dashboardTitle = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > h2"));
		String dashboardTitleText = dashboardTitle.getText();
		assertEquals("Dashboard",dashboardTitleText);
                
                //explicit wait
                //verify that Dashboard title contains string "dashboard"
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.titleContains("Dashboard"));
                
                
		driver.close();}
		
   }    