package DecoratorDesignPattern;

public class SportyDress extends DressDecorator{
	public SportyDress(Dress d) {
		super(d);
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Adding Sporty Dress Features");
	}

	
 }
