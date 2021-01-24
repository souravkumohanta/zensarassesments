package service;
import bean.*;

public class MyBank extends AccountInitialization implements Bank{

	public boolean isvalidacc(int acno)
	{
		boolean res = false;
		
		for(int i=0;i<accountCount;i++)
		{
			try {
			if(accounts[i].getAccno()==acno)
			{	res= true;}
			else
			{	res= false;}
			
			
			}
			catch(Exception e)
			{
				System.out.println("INVALID ACCOUNT");
				
			}
		}
		return res;
		
		
	}
	
	
	
	
	@Override
	public void withdraw(int acno,int amt) {
		// TODO Auto-generated method stub
		int temp=0;
		if(isvalidacc(acno)==true)
		{
			for(int i=0;i<accounts.length;i++)
			{
				if(accounts[i].getAccno()==acno)
				{
					if((accounts[i].getAmount()-amt)>500) {
						 temp=accounts[i].getAmount()-amt;
					   accounts[i].setAmount(temp);}
					else
						{System.out.println("Insufficient balance remaining.");}
				}
			}
		}
		
	}
	@Override
	public void deposit(int acno,int amt) {
		// TODO Auto-generated method stub
		if(isvalidacc(acno)==true)
		{
			for(int i=0;i<accounts.length;i++)
			{
				if(accounts[i].getAccno()==acno)
				{
					
					accounts[i].setAmount(accounts[i].getAmount()+amt);
				}
			}
		}
		
	}
	@Override
	public void checkBalance(int actno) {
		// TODO Auto-generated method stub
		if(isvalidacc(actno)==true)
		{
			for(int i=0;i<=accounts.length;i++)
			{
				
				if(accounts[i].getAccno()==actno)
				{
					System.out.println("The amount is: ");
					
					System.out.println(accounts[i].getAmount());
				}
				else
				{
					System.out.println("invalid");
				
					
				}
			}
		}
		
	}
	@Override
	public void transfer(int fromacc, int toaccno, int amount) {
		// TODO Auto-generated method stub
		
		if(isvalidacc(fromacc)==true&&isvalidacc(toaccno)==true)
		{
			int i=0;
			//to find the accounts
				while(accounts[i].getAccno()==fromacc)
				{
				for(int j=0;j<accountCount;j++)
				{
					if(accounts[j].getAccno()==toaccno)
					{
						//check if remaining balance is > 500
						try {
						if(accounts[i].getAmount()>500)
						{
						 accounts[i].setAmount(accounts[i].getAmount()-amount);
						 accounts[j].setAmount(accounts[i].getAmount()+amount);
						}
						else
						{
							System.out.println("Insufficient funds remaining post transfer.");
						}
						}
						catch(Exception e)
						{
							System.err.println("INSUFFICIENT FUNDS EXCEPTION.");
							
						}
					}
				}
			}
		}


	
	}
	
	

	
		
}
	

