package Synechron.sypi;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		Thread.sleep(2000);
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		WebElement clickhere= driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
		clickhere.click();
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		
		//iterator among the windows
		Iterator<String> itr=allwindows.iterator();
		while(itr.hasNext()) {
			String childwindow=itr.next();
			if(!parentwindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				
				String text=driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
				System.out.println(text);
				driver.close();
			}
		}
	}

}
