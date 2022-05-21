package FacadeDesignPattern;

public class FacadeDesignPatttern {

	public static void main(String[] args) {
		String test = "CheckElementPresent";
		
		FacadeHelper.generateReport("firefox", "html", test);
		FacadeHelper.generateReport("firefox", "junit", test);
		FacadeHelper.generateReport("chrome", "html", test);
		FacadeHelper.generateReport("chrome", "junit", test);

	}

}
