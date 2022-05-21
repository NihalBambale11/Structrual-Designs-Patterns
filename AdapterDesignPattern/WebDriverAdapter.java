package AdapterDesignPattern;

public class WebDriverAdapter implements WebDriver {
   
	IEDriver id = new IEDriver();
	
	@Override
	public void getElement() {
		id.findElement();
		
	}

	@Override
	public void selectElement() {
		id.clickElement();
		
	}

}
