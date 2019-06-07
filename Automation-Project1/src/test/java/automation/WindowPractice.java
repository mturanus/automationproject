package automation;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowPractice extends TestBase {
	
	
	
	@Test
	public void test() {
		
		driver.get("http://the-internet.herokuapp.com/windows");
		
		
		//this method will return the ID for the page. 
		String defaultWindow=driver.getWindowHandle(); 
		//System.out.println(defaultWindow);
		
		//getWindowHandles() method will return ID'S for all the tabs which are opened. Return type is SET. 
		
		WebElement clickButton=driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		clickButton.click();
		
		
		Set<String> windows=driver.getWindowHandles();
		
		for(String each:windows) {
			// 1 2 
			// if it is not equals 1 --- it means it is equals two 
			if(!each.equals(defaultWindow)) {
				driver.switchTo().window(each);
				
				System.out.println(driver.getTitle());
			    System.out.println(each);
			}
			
		}
		
	}
	

}
