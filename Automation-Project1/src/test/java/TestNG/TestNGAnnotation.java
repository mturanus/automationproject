package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	@BeforeClass
	public static void test5() {
		System.out.println("@BeforeClass --> this is the method from TEST5");
		//launching the driver
				//login
				//click
				//10 
	}
	
	
	@AfterClass
	public static void test6() {
		System.out.println("@AfterClass --> this is the method from TEST6");
	}
	
	@BeforeMethod
	public static void test3() {
		System.out.println("@BeforeMethod --> This is the method from TEST3 ");
	}

	
	
	@AfterMethod
	public static void test4() {
		System.out.println("@AfterMethod --> This is the method from TEST4 ");
	}
	
	
	@Test
	public static void test1() {
		System.out.println("@Test --> This is the method from TEST1");
		//launching the driver
		//login
		//click
		//10 
	}
	
	
	@Test
	public static void test7() {
		System.out.println("@Test --> This is the method from TEST7");
		//launching the driver
				//login
				//click
				//10 
	}
	
	
	@Test
	public static void test2() {
		System.out.println("@Test --> This is the method from TEST2");
		//launching the driver
				//login
				//click
				//10 
	}
	

}
