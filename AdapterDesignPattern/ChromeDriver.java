package AdapterDesignPattern;

public class ChromeDriver implements WebDriver {

	@Override
	public void getElement() {
		System.out.println("    Get Driver From Chrome");
		
	}

	@Override
	public void selectElement() {
		System.out.println("    Select Driver from Chrome");
		
	}
	

}
