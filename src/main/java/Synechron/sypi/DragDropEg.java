package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragDropEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/drag_and_drop");
		Thread.sleep(2000);
		//double click
		WebElement source=driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='column-b']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(source, dest).perform();
	}

}
