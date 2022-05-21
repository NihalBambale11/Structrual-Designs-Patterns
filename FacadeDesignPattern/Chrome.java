package FacadeDesignPattern;

import java.sql.Driver;

public class Chrome {
	public static Driver getChromeDriver() {
		return null;
	}
	
	public static void generatedHTMLReport(String test , Driver d) {
		System.out.println("Generating HTML Report For Chrome Driver ");
	}
	
	public static void generatedJunitReport(String test, Driver d) {
		System.out.println("Generating JUNIT Report For Chrome Driver ");
	}

}