package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNGAssertion {

	
	
	@Test
	public static void test() {
		
		String actual=StringFormMethods.form("30", "100", "55");
		String expected="30 out of 100. Total spending value is 55"; 
		Assert.assertEquals(expected, actual);
		//if hard assertion is failing this line will not be printed. 
		System.out.println("This is hard Assertion");
		
	}
	
	@Test
	public static void test1() {
		
		String actual=StringFormMethods.form("30", "100", "55");
		String expected="30 out of 100. Total spending value is 55"; 
		Assert.assertEquals(expected, actual);
		//if hard assertion is failing this line will not be printed. 
		System.out.println("This is hard Assertion");
		
	}
	
	@Test
	public static void test3() {
		
		SoftAssert soft=new SoftAssert(); 
		String actual=StringFormMethods.form("30", "100", "55");
		String expected="20 out of 100. Total spending value is 55"; 
		
		String actual1=StringFormMethods.form("30", "100", "55");
		String expected1="30 out of 100. Total spending value is 55"; 
		

		soft.assertEquals(expected, actual);
		soft.assertEquals(expected1, actual1);

		System.out.println("This is Soft Assertion test3");
		soft.assertAll();
	}
}
