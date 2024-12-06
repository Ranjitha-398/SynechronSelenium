package Synechron.sypi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobuttons {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
			driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//single select
			WebElement radio=driver.findElement(By.xpath("//input[@value='radio1']"));
			
			//check box
			//WebElement checkbox=driver.findElement(By.id("checkBoxOption1"));
			//checkbox.click();
			
			//for loop clicking on check boxes
			
			List<WebElement> chkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
			int size=chkboxes.size();
			System.out.println(size);
			for(int i=0;i<=size;i++) {
				chkboxes.get(i).click();
			}
			
			//To select the drop down list
			
			WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
			Select sel=new Select(dropdown);
			
			sel.selectByIndex(1);
			Thread.sleep(1000);
			
			sel.selectByValue("option");
			Thread.sleep(1000);
			
			sel.selectByVisibleText("Option3");
			Thread.sleep(1000);
}
}
