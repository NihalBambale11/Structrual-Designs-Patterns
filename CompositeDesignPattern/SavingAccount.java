package CompositeDesignPattern;

public class SavingAccount extends Account {
	private String Accountno;
	private float accountBalance;
	
	SavingAccount(String Accountno,float accountBalance){
		this.Accountno=Accountno;
		this.accountBalance=accountBalance;
	}

	@Override
	public float getBalance() {
		return accountBalance;
		
	}

}