package Synechron.sypi;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriverManager.firefoxdriver().setup();
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new ChromeDriver();
			WebDriver driver1 = new FirefoxDriver();
			WebDriver driver2 = new EdgeDriver();
			driver.get("https://www.amazon.com/");
			driver1.get("https://www.google.com/");
			driver2.get("https://www.goggle.com/");
			
	}

}
