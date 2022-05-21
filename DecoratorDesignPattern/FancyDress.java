package DecoratorDesignPattern;

public class FancyDress extends DressDecorator{
	public FancyDress(Dress d) {
		super(d);
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Adding Fancy Dress Features");
	}

	
 }