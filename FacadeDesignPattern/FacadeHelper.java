package FacadeDesignPattern;

import java.sql.Driver;

public class FacadeHelper {
	
	public static void generateReport(String exploror,String report ,String test) {
		Driver d = null;
		switch(exploror) {
		case "firefox":
			d = FireFox.getFireFoxDriver();
			switch(report) {
			case "html":
				FireFox.generatedHTMLReport(test, d);
				break;
			
		    case "junit":
		    	FireFox.generatedJunitReport(test, d);
		    	break;
		    }
			break;
		case "chrome":
			d = Chrome.getChromeDriver();
			switch(report) {
			case "html":
				Chrome.generatedHTMLReport(test, d);
				break;
			case "junit":
				Chrome.generatedJunitReport(test, d);
				break;
			} 
		 }
	}

}
