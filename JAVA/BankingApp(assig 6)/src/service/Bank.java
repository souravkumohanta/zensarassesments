package service;
import bean.Account;
//interface declared to define the methods of which ,implemented body in MyBank class
interface Bank
{
	
	
	 void withdraw(int actno,int amot);
	void deposit(int actno,int amot);
	void checkBalance(int actno);
}
