package DecoratorDesignPattern;

public class CasualDress extends DressDecorator{
	public CasualDress(Dress d) {
		super(d);
	}
	
	public void assemble() {
		super.assemble();
		System.out.println("Adding Casual Dress Features");
	}

	
 }


