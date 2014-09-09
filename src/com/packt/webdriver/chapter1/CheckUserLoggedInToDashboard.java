package com.packt.webdriver.chapter1;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.testselenium2014.tests.pageobjects.LoginPage;



public class CheckUserLoggedInToDashboard {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		LoginPage lgnPage = PageFactory.initElements(driver, LoginPage.class);
                lgnPage.login("testselenium2014", "velosiped");
		lgnPage.checkTitle("Dashboard");
                //explicit wait
                //verify that Dashboard title contains string "dashboard"
                WebDriverWait wait = new WebDriverWait(driver, 10);
                wait.until(ExpectedConditions.titleContains("Dashboard"));
		driver.close();}
		
   }    