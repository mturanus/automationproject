package TestPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	@Test
	@Parameters({"username", "password"})
	public static void login(String username, String password) {	
		System.out.println("the username for the user is "+username);
		System.out.println("the password for the user is "+password);
	}
	
	
	
	

}
