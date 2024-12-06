package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
			driver.get("https://www.amazon.com/");
			//id locators
			WebElement username= driver.findElement(By.id("ap_email"));
			username.sendKeys("9980028123");
			
			//classname
			WebElement login= driver.findElement(By.className("a-button a-button-span12 a-button-primary"));
			login.click();
			
			//name locators
			WebElement password= driver.findElement(By.name("password"));
			password.sendKeys("Ranju456");
			
			//link text
			WebElement forgotpassword= driver.findElement(By.linkText("Forgot Password?"));
			forgotpassword.click();
			
			//Partial text
			WebElement forgotpassword1= driver.findElement(By.partialLinkText("Forgot"));
			forgotpassword1.click();
			
			//xpath
			WebElement createaccount= driver.findElement(By.xpath("//a[@id='ap_change_login_claim']"));
			createaccount.click();
			
			
			
			
}
}

