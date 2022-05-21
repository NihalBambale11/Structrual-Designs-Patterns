package DecoratorDesignPattern;

public class DressDecorator implements Dress {
	protected Dress d;
	public DressDecorator(Dress d) {
		this.d=d;
	}
	@Override
	public void assemble() {
		this.d.assemble();

	}
	

}
