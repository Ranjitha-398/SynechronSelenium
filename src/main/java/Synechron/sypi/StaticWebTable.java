package Synechron.sypi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		Thread.sleep(2000);
		
		//fetch the no of rows
		List<WebElement> rowno=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowsize=rowno.size();
		System.out.println(rowsize);
		
		
		//fetch the no of cols
		List<WebElement> colno=driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		int colsize=colno.size();
		System.out.println(colsize);
				
		WebElement celldata=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[3]/td[2]"));
		String s=celldata.getText();
		System.out.println(s);
		String Expected="JASON";
		if(s.equalsIgnoreCase(Expected)) {
			System.out.println("Text is matching");
			
		}
		else {
			System.out.println("Text is not matching");
			
		}
		driver.close();
				
	}
}
