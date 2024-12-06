package Synechron.sypi;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrolltoElementEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
		WebElement test=driver.findElement(By.xpath("//a[contains(text(),'Practice Test Automation.')]"));
		Actions act=new Actions(driver);
		act.scrollToElement(test).perform();
		Thread.sleep(2000);
		test.click();
	}

}
