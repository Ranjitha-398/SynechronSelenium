package Synechron.sypi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2EScenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		//login credentials
		WebElement username= driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement login= driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		Thread.sleep(2000);
		
		//Add to cart the item
		WebElement headertext=driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]"));
		String a=headertext.getText();
		WebElement AddtoCart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		AddtoCart.click();
		Thread.sleep(2000);
		
		//Tap on Cart icon
		WebElement Cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		Cart.click();
		Thread.sleep(2000);
		
		//Compare the items in cart
		WebElement Cartdetails=driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		Thread.sleep(2000);
		String c=Cartdetails.getText();
		if(a.equals(c)) {
			System.out.println("product is avaiable");
		}
		else {
			System.out.println("product is not avaiable");
			
		}
		WebElement Checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
		Checkout.click();
		Thread.sleep(2000);
		
		//User details
		WebElement Firstname= driver.findElement(By.xpath("//input[@id='first-name']"));
		Firstname.sendKeys("Ranjitha");
		Thread.sleep(2000);
		WebElement lastname= driver.findElement(By.xpath("//input[@id='last-name']"));
		lastname.sendKeys("Ranju");
		Thread.sleep(2000);
		WebElement zipcode= driver.findElement(By.xpath("//input[@id='postal-code']"));
		zipcode.sendKeys("30005");
		Thread.sleep(2000);
		WebElement continue1= driver.findElement(By.xpath("//input[@id='continue']"));
		continue1.click();
		Thread.sleep(2000);
		WebElement finish= driver.findElement(By.xpath("//button[@id='finish']"));
		finish.click();
		Thread.sleep(2000);
		
		//Validating the order confirmation 
		String b="Thank you for your order!";
		WebElement OrderConfirmation=driver.findElement(By.xpath("//h2[@class='complete-header']"));
		String o=OrderConfirmation.getText();
		Thread.sleep(2000);
		if(b.equals(o)) {
			System.out.println("Text is matching");
		}
		else {
			System.out.println("Text is not matching");
			
		}
		driver.close();				
	}

}
