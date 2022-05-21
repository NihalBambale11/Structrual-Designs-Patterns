package FacadeDesignPattern;

import java.sql.Driver;

public class FireFox {
	public static Driver getFireFoxDriver() {
		return null;
	}
	
	public static void generatedHTMLReport(String test ,Driver d) {
		System.out.println("Generating HTML Report For FireFox Driver ");
	}
	
	public static void generatedJunitReport(String test, Driver d) {
		System.out.println("Generating JUNIT Report For FireFox Driver ");
	}

}
