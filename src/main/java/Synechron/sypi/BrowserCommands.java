package Synechron.sypi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		//get command
			driver.get("https://www.selenium.dev/");
			
		//get title command
			String title=driver.getTitle();
			System.out.println(title);
			
		//get Current Url
			String currurl=driver.getCurrentUrl();
			System.out.println(currurl);
		
		//get page source
			String pagesrc=driver.getPageSource();
			System.out.println(pagesrc);
			
		//close the browser
			driver.close();
			
			
	}

}
