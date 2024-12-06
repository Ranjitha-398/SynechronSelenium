package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
			driver.get("https://practicetestautomation.com/");
			//id locators
			WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
			username.sendKeys("student");
			
			
			//name locators
			WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
			password.sendKeys("Password123");
			
			//classname
			WebElement login= driver.findElement(By.className("btn"));
			login.click();
			
			WebElement logo=driver.findElement(By.className("custom-logo"));
			if(logo.isDisplayed()) {
				System.out.println("Home Page is displayed");
			}
			else {
				System.out.println("Home Page is not diaplyed");
			}
			
			
		
	}

}
