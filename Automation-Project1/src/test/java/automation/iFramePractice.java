package automation;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFramePractice extends TestBase {
	
	
	
	//@Test
	public void test() {
		
		driver.get("http://the-internet.herokuapp.com/iframe");
		
		//this is finding the element of second Iframe
		WebElement frame=driver.findElement(By.tagName("iframe")); 
		
		//it is switching to the sub html(iframe)
		driver.switchTo().frame(frame); 
		
		WebElement element=driver.findElement(By.id("tinymce"));
		
		// Selenium can only handle on html at a time. 
	
		element.sendKeys("Something Else"); 
		
		//this method will switch back to the main html 
		driver.switchTo().defaultContent();
		
		WebElement text=driver.findElement(By.xpath("//div//h3")); 
		
		
		System.out.println(text.getText()); 
		
		
	}
	
	
	
	//@Test
	public void test1() {
		
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
		//int number start from the 0 and it will increase 
		
		driver.switchTo().frame(1);
			
		WebElement draggable=driver.findElement(By.xpath("//a[@href='https://demoqa.com/draggable/']")); 
		System.out.println(draggable.getText()); 

		
	}
	
		@Test
		public void test2() {
			
			driver.get("https://www.toolsqa.com/iframe-practice-page/");
		
			//this one will switch the frame with Iframe name
			
			List<WebElement> frames=driver.findElements(By.xpath("//iframe")); 
			
			System.out.println(frames.size());
			
			driver.switchTo().frame("iframe1"); 
				
			WebElement automationText=driver.findElement(By.xpath("(//span[@style='color: #3366ff;'])[1]"));
			
			System.out.println(automationText.getText());
			
		}
	
	
	

}
