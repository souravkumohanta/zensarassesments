package main;
import java.io.IOException;
import java.util.Scanner;
import bean.Account;
import service.*;
public class BankTest {

	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		MyBank call=new MyBank();
		int a,amt,from,too,p=0;
		String name;
		do {
			System.out.println("DO YOU WANT TO CONTINUE ");
			System.out.println("1. create account ");
			System.out.println("2.check balance  ");
			System.out.println("3: withdraw ");
			System.out.println("4: Deposit ");
			System.out.println("5: Transfer  ");
			System.out.println("6:EXIT ");
		System.out.println("Enter your choice : ");
		a =sc.nextInt();
		switch(a)
		{
		case 1: 
		
			
			System.out.print("press 1 for default creation \t  2 for user creation");
			int crr=sc.nextInt();
			if(crr==1)
			{
				call.accountCreate();
				break;
			}
			else
			{
			System.out.println("1. create account ");
			System.out.println("Enter the name : ");
			name=sc.next();
			System.out.print("Enter the amount: ");
			 amt=sc.nextInt();
			call.accountCreate(amt,name);
			break;
			}
		
		case 2: 
		{
			System.out.println("2.check balance  ");
			System.out.println("Enter the acc no: ");
			int acc=sc.nextInt();
			call.checkBalance(acc);
			
			break;
		}
		case 3:
		{
			System.out.println("3: withdraw ");
			System.out.println("Enter the account no. : ");
			int acno=sc.nextInt();
			System.out.println("Enter the amount: ");
			 amt=sc.nextInt();
			call.withdraw(acno, amt);
			
			break;
		}
		case 4: 
		{
			System.out.println("4: Deposit ");
			System.out.println("Enter the account no.: ");
			int acc=sc.nextInt();
			System.out.println("Enter the amount: ");
			amt=sc.nextInt();
			call.deposit(acc, amt);
			
			
			break;
		}
		case 5: 
		{
			System.out.println("5: Transfer  ");
			System.out.println("Enter the depositer account no. : ");
		    from=sc.nextInt();
			System.out.println("Enter the credited account no. : ");
			 too=sc.nextInt();
			System.out.println("Enter the amount : ");
			amt=sc.nextInt();
			call.transfer(from, too, amt);
			break;
		}
		case 6:
			System.out.println("6:EXIT ");
			p=3;
			
			break;
			
		default:
			System.out.println("INVALID CHOICE. ");
			break;
		}
		
		
		}
		while(p!=3);
		
		System.out.println("Thank YOU");
		
	}
	
	
}
