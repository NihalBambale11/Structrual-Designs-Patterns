package CompositeDesignPattern;

public class CompositeDesignPatttern {

	public static void main(String[] args) {
		CompositeAccount ca = new CompositeAccount();

	    ca.addAccount(new DepositeAccount("DA001", 100));
	    ca.addAccount(new DepositeAccount("DA002", 110));
	    ca.addAccount(new SavingAccount("SA001", 200));

	    float totalBalance = ca.getBalance();
	    System.out.println("Total Balance : " + totalBalance);

	}

}
