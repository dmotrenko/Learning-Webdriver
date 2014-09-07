package wordpress.testselenium2014.tests.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage { 
    
    WebDriver driver;
    WebElement login;
    WebElement password;
    WebElement submit;
    
    
    //class cunstructor
    public LoginPage(WebDriver driver){
        this.driver = driver;
        driver.get("https://testselenium2014.wordpress.com/wp-login.php");
        login = driver.findElement(By.id("user_login"));
        password = driver.findElement(By.id("user_pass"));
        submit = driver.findElement(By.id("wp-submit"));
        
    }
    
    public void login(String username,String userPassword ){
        login.sendKeys(username);
        password.sendKeys(userPassword);
        submit.click();
    }
};