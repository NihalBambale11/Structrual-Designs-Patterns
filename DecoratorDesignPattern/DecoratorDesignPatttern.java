package DecoratorDesignPattern;

public class DecoratorDesignPatttern {

	public static void main(String[] args) {
		Dress sd = new SportyDress(new BasicDress());
		sd.assemble();
		System.out.println();
		
		Dress fd = new FancyDress(new BasicDress());
		fd.assemble();
		System.out.println();
		
		Dress cd = new CasualDress(new BasicDress());
		cd.assemble();
		System.out.println();
		
		Dress sfd = new SportyDress(new FancyDress(new BasicDress()));
		sfd.assemble();
		System.out.println();
		
		Dress fcd = new CasualDress(new FancyDress(new BasicDress()));
		fcd.assemble();
		System.out.println();
		
		Dress scd  = new SportyDress(new CasualDress(new BasicDress()));
		scd.assemble();
		System.out.println();
	}

}
