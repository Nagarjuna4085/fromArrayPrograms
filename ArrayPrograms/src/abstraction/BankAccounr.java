package abstraction;


public abstract class BankAccounr {
	private String name;
	private String accNumber;
	protected double balance;
	public BankAccounr(String name,String acc) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.accNumber = acc;
		
	}
	
	// deposit
	public abstract void deposit(double b);
	
	// withdraw
	public abstract void withdraw(double bal);
	public static void main(String[] args) {
		BankAccounr[] bks = {new SavingAccount("johm", "3565432"),new CurrentAccount("DOe", "23456789")};
		
		for(BankAccounr bk:bks) {
			bk.deposit(100.00);
			bk.withdraw(2);
		}
		
	}

}

class SavingAccount  extends BankAccounr{
	
	SavingAccount(String name,String accNumber){
		super(name,accNumber);
		
	}
	@Override
	public void deposit(double bal) {
		// TODO Auto-generated method stub
		balance+=bal;
		
	}
	@Override
	public void withdraw(double b) {
		// TODO Auto-generated method stub
		balance-=b;
		System.out.println("success");
		
	}
}



class CurrentAccount  extends BankAccounr{
	
	CurrentAccount(String name,String accNumber){
		super(name,accNumber);
		
	}
	@Override
	public void deposit(double bal) {
		// TODO Auto-generated method stub
		balance+=bal;
		System.out.println("success");
		
	}
	@Override
	public void withdraw(double b) {
		// TODO Auto-generated method stub
		if(balance < 2000.00) {
			System.out.println("withdraw not possible");
			return;
		}
		balance-=b;
		
	}
}
