package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {

	@Test
	public void f() {

		SoftAssert soft = new SoftAssert();

		soft.assertEquals("Muammer", "Turan");
		System.out.println("first running 1");

		soft.assertEquals("Muammer", "Turan");
		System.out.println("first running 2");

		soft.assertAll();

	}

}
