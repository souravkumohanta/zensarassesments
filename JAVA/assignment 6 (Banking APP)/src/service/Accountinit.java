package service;
import bean.*;

abstract class AccountInitialization
{
	abstract void transfer(int fromacc,int toaccno,int amount);
	static int accountCount=0,loop_var=0;
	 Account accounts[]=new Account[10];
	static int accno=1010;
	 String name;
	 int amount;
	

     public void accountCreate()
	{
		if(accountCount<10)
		{
			name="Unknown";
		  
			amount=500;
			System.out.println("Default account created");
			accounts[loop_var]=new Account(accno,name,amount);
			accno++;
			accountCount++;
			loop_var++;
			
		}
		else
		{
		System.out.println("Limit!");}
	
	}
	


     
   public void accountCreate(int amount, String name) {
		// TODO Auto-generated method stub
		
		
	if(AccountInitialization.accountCount<10)
	{
		System.out.println("Created : ");
		if(amount>500)
		{
		
			
				this.amount=amount;
				this.name=name;
			
				
				accounts[accountCount]=new Account(AccountInitialization.accno,this.name,this.amount);
				AccountInitialization.accno++;
				accountCount++;
				
				
				System.out.println("Name : "+accounts[loop_var].getName());
				System.out.println("Amount : "+accounts[loop_var].getAmount());
				System.out.println("Account number : "+accounts[loop_var].getAccno());
				loop_var++;
			}
			else {
				System.out.println("Amount < 500 is not allowed!");
			}
		}
		else
		{
			System.out.println("Bank limit reached.");
		}
	}
	
	
	

}
		

		
	
		
	

