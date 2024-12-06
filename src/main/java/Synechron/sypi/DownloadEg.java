package Synechron.sypi;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
			driver.navigate().to("https://the-internet.herokuapp.com/download");
			Thread.sleep(2000);
			WebElement download=driver.findElement(By.xpath("//a[contains(text(),'some-file.txt')]"));
			download.click();
			File f=new File("C:\\Users\\Kiosk_user\\Downloads\\SomeFile.txt");
			if(f.exists())
			{
				System.out.println("File Exists");
				
			}
			else {
				System.out.println("File do not Exists");
			}
			driver.close();
	}

}
