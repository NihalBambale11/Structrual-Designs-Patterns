package AdapterDesignPattern;

public class AdapterDesignPatttern {

	public static void main(String[] args) {
		System.out.println(" * From WEB DRIVER ADAPTER Class");
		WebDriverAdapter wda = new WebDriverAdapter();
	    wda.getElement();
		wda.selectElement();
		System.out.println();
		
		System.out.println(" * From CHROME DRIVER Class");
		ChromeDriver cd = new ChromeDriver();
		cd.getElement();
		cd.selectElement();
		System.out.println();
		
		System.out.println(" * From IE DRIVER Class");
		IEDriver id = new IEDriver();
		id.findElement();
		id.clickElement();

	}

}
