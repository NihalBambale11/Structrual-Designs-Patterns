package CompositeDesignPattern;

public class DepositeAccount extends Account {
	private String Accountno;
	private float accountBalance;
	
	DepositeAccount(String Accountno,float accountBalance){
		this.Accountno=Accountno;
		this.accountBalance=accountBalance;
	}

	@Override
	public float getBalance() {
		return accountBalance;
		
	}

}
