package service;
import bean.Account;
import java.util.Scanner;
public class MyBank extends AccountInitialization implements Bank{

	boolean isvalid(int acno)
	{
		boolean res;
		
		return res;
	}
	void transfer(int fromacc,int toAccno,int amount)
	{
		if(isvalid(fromacc)==true&&isvalid(toAccno)==true)
		{
			
		}
	
		
		
	}
	
	public void withdraw()
	{
		
	}
	public void deposit()
	{
		
		
	}
	public void checkBalance()
	{
		
		
	}

	@Override
	void accountCreate(int amt, String nam) {
		// TODO Auto-generated method stub
	
	Accountinit obj =new Accountinit();
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the name: ");
	
	String nm =sc.next();
	obj.setName(nm);
	
	System.out.println("Enter the amount: ");
	int inputamt=sc.nextInt();
	if(inputamt>500)
	{
		obj.setAmount(inputamt);
	}
	else
	{
		System.out.println("Wrong input");
	}
	
	}

	
		
}
	

