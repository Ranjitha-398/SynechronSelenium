package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(4000);
		//double click
		WebElement bestseller=driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]"));
		Actions act=new Actions(driver);
		act.doubleClick(bestseller).perform();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		WebElement mobile=driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(@class,'')][contains(text(),'Mobiles')]"));
		act.contextClick().perform();
		Thread.sleep(3000);
		//driver.navigate().back();
		driver.close();
	}
}
