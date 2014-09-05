package com.packt.webdriver.chapter1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;



public class NavigateToAUrl {
	public static void main(String[] args){
		String user = "testselenium2014";
		String pass = "velosiped";
		
		WebDriver driver = new FirefoxDriver();
		
		//login to site
		driver.get("https://testselenium2014.wordpress.com/");
		WebElement signinLink = driver.findElement(By.linkText("Log in"));
		signinLink.click();
		WebElement username = driver.findElement(By.id("user_login"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.id("user_pass"));
		password.sendKeys(pass);
		WebElement submitButton = driver.findElement(By.id("wp-submit"));
		submitButton.click();
		
		//verify that we see dashboad
		WebElement dashboardTitle = driver.findElement(By.cssSelector("#wpbody-content > div.wrap > h2"));
		String dashboardTitleText = dashboardTitle.getText();
		assertEquals("Dashboard",dashboardTitleText);

		driver.close();}
		
   }