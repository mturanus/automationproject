package automation;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopupPractice extends TestBase {
	
	
	
	
	@Test
	public void test() throws InterruptedException {
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement element=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		
		element.click();
		
		Alert alert=driver.switchTo().alert();

		alert.accept();
		
		WebElement jsConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

		jsConfirm.click();
		
		alert.accept();
		
		WebElement jsPrompt=driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

		jsPrompt.click();
		
		Thread.sleep(2000);
		
		alert.sendKeys("Something Else");
		
		Thread.sleep(2000);

		alert.accept();
		
		//The output in the console it is called Log
		// Check the log
	
		
		//to be able to handle the popup on the page we can use two different method 
		// one is accept
		// second is dismiss
	
		
	}
	
	
	@Test
	public void test1() {
		
		driver.get("https://sweetalert.js.org/");
		//preview button
		WebElement el=driver.findElement(By.xpath("(//button[@class='preview'])[2]"));
	
		el.click();
		//okay button
		driver.findElement(By.xpath("//button[@class='swal-button swal-button--confirm']")).click();
		
		String str="Techtorial"; 
		
		
		
		str.substring(3).trim().charAt(2);
		
		
		char ch='f';
		
	}
	

}
