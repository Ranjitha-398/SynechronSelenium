package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovetoElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		WebElement hover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		WebElement top=driver.findElement(By.xpath("//a[contains(text(),'Top')]"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(hover).perform();
		Thread.sleep(2000);
		act.moveToElement(top).perform();
		act.click(top).perform();
		WebElement logo=driver.findElement(By.xpath("//img[@class='logoClass']"));
		
		if(logo.isDisplayed()) {
			System.out.println("Dispalyed");
		}
		else {
			System.out.println("not displayed");
		}
	}

}
