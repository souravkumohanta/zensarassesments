package service;
import bean.Account;
abstract class AccountInitialization
{
	static int accountCount=0;
	Account accounts[]=new Account[10];
	private int acno=1010;
	private String name="Unknown";
	private int amount=500;
	


public static int getAccountCount() {
		return accountCount;
	}



	public static void setAccountCount(int accountCount) {
		AccountInitialization.accountCount = accountCount;
	}



	public Account[] getAccounts() {
		return accounts;
	}



	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}



	public int getAcno() {
		return acno;
	}



	public void setAcno(int acno) {
		this.acno = acno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



abstract void accountCreate(int amt,String nam);
}
class Accountinit extends AccountInitialization{

	
	@Override
	void accountCreate(int amount, String name) {
		// TODO Auto-generated method stub
		int acno=getAcno();
		
		if(amount > 500)
		
		
	}
	
}
