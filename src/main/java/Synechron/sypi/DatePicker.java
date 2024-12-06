package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
		//add frame path
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement datepicker=driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepicker.click();
		
		//WebElement date=driver.findElement(By.xpath("//body/div[@id='ui-datepicker-div']/table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[5]/a[1]"));
		WebElement date=driver.findElement(By.xpath("(//a[contains(text(),'5')])[1]"));
		date.click();
		
		String s=date.getText();
		System.out.println(s);
		
}
}
