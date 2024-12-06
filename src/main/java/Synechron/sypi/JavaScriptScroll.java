package Synechron.sypi;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://practicetestautomation.com/");
		Thread.sleep(2000);
		//scroll vertical down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(2000);
		//scroll up
		js.executeScript("window.scrollBy(0,-300)", "");
		Thread.sleep(2000);
		//horizontal scroll right scroll
		//js.executeScript("window.scrollBy(900,0)", "");
		//horizontal left scroll
		//js.executeScript("window.scrollBy(-700,0)", "");
	}

}
