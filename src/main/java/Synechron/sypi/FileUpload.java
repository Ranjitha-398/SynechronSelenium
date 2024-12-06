package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
			driver.navigate().to("https://the-internet.herokuapp.com/upload");
			Thread.sleep(2000);
			WebElement browse=driver.findElement(By.xpath("//input[@id='file-upload']"));
			browse.sendKeys("C:\\Users\\Kiosk_user\\Downloads\\29th.txt");
			WebElement submit=driver.findElement(By.xpath("//input[@id='file-submit']"));
			submit.click();
			Thread.sleep(2000);
			WebElement fileupload=driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded!')]"));
			if(fileupload.isDisplayed()) {
				System.out.println("The file is uploaded properly");
			
			}
			else {
				System.out.println("The file is not uploaded properly");
			}
	}

}
