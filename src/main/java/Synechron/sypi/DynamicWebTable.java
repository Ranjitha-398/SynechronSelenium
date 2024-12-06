package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("jalakammounica@gmail.com");
		driver.findElement(By.name("password")).sendKeys("!YWR3q8#293XKbk");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		//driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		Thread.sleep(2000);
		
		//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[3]/td[2]
		//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[2]/td[2]
		
		String beforexpath="//table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr[";
		String afterxpath="]/td[2]";
		for(int i=0;i<=4;i++) {
			String name=driver.findElement(By.xpath(beforexpath +i+ afterxpath)).getText();
			System.out.println(name);
			if(name.contains("Deepak Patil")) {
				driver.findElement(By.xpath("table[@class='ui celled definition sortable striped table custom-grid']/tbody/tr["+i+"]/td[2]")).click();
			}
		}
		
}
}

