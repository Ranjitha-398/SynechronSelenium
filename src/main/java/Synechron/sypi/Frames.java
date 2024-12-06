package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		Thread.sleep(2000);
		//add frame path
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement newyork=driver.findElement(By.xpath("//label[contains(text(),'New York')]"));
		
		
		//index
		//driver.switchTo().frame(0);
		//name or id
		//driver.switchTo().frame("demoframe");
		newyork.click();
		
	}

}
