package TestNG;

public class StringFormMethods {
	
	
	public static String form(String one, String two, String three) {
		
		String formatted=String.format("%s out of %s. Total spending value is %s", one, two, three); 
		
		// 30 100 55
		//30 out of 100. Total spending value is 55
		return formatted;
	}

}
