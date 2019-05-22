package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumMethod {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
	
		WebDriver driver; 
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver(); 
		
		driver.navigate().to("https://www.spicejet.com/");
		
		driver.get("https://www.google.com/");
		
		driver.navigate().back();
		
		String actualurl=driver.getCurrentUrl(); 
		
		String expectedurl="https://www.spicejet.com/";
		
		if(actualurl.equals(expectedurl)) {
			
			System.out.println(true);
		}else {
			
			System.out.println(false);
		}
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.findElement(By.xpath("//a[@href='Process.aspx']"));
		
		//Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
	}

}
