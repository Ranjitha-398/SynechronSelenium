package Synechron.sypi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
			driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
			Thread.sleep(2000);
			WebElement simplealert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
			simplealert.click();
			Alert alt=driver.switchTo().alert();
			alt.accept();
			Thread.sleep(2000);
			
			WebElement confirmalert= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
			confirmalert.click();
			Alert alt1=driver.switchTo().alert();
			String alttext1=alt1.getText();
			System.out.println(alttext1);
			alt1.dismiss();
			Thread.sleep(2000);
			
			WebElement promptalert= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
			promptalert.click();
			Alert alt2=driver.switchTo().alert();
			String alttext= alt2.getText();
			System.out.println(alttext);
			alt2.sendKeys("Ranju");
			alt2.accept();
			Thread.sleep(2000);
			
			
			
			
			
	}

}
