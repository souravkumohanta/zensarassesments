package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import bean.employee;
import service.*;

public class empTest
{

	public static void main(String[] args)
	{
		
		List<employee> listOfEmp = new ArrayList<>();
			int ch;
			System.out.println("How many records want to store?");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			for(int i=0;i<n;i++) 
			{
			System.out.println("Enter the Id:");
			int id=sc.nextInt();
			System.out.println("Enter the Name:");
			String name =sc.next();
			System.out.println("Enter the Salary:");
			float salary=sc.nextFloat();
			listOfEmp.add(new employee(id, name, salary));
			}
			System.out.println("Before Sort");
			for(employee emp : listOfEmp) 
			{
				System.out.println(emp);
			}
			
		do 
		{
			System.out.println("***Main Menu***\n1. Sort By Id\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("2. Sort By Name\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("3. Sort By Salary\n   1. Ascending Order\n   2. Descending Order");
			System.out.println("Enter Your Choice :");
	       ch = sc.nextInt();	
	       switch(ch)
           {	
           		case 1:
           					System.out.println("Enter Your Choice :");
           					int c = sc.nextInt();
           					switch(c)
           					{
           					case 1: 	
         							Collections.sort(listOfEmp,new byid());			// using comparator 
         							System.out.println();
         							System.out.println("After Sort");
         							for(employee emp : listOfEmp) 
         							{
         								System.out.println(emp);
         							
         							}
         							break;
         							
           					case 2: 
         							Collections.sort(listOfEmp,new byid());			// using comparator 
         							System.out.println();
         							System.out.println("After Sort");
         							Collections.reverse(listOfEmp);
         							for(employee emp : listOfEmp) 
         							{
         								System.out.println(emp);
 		    	
         							}
         							break;
           					}
           					break;
           					
           		case 2:
   							System.out.println("Enter Your Choice :");
   							c = sc.nextInt();
   							switch(c)
   							{
   							case 1: 	
   									Collections.sort(listOfEmp,new byname());			// using comparator 
   									System.out.println();
   									System.out.println("After Sort");
   									for(employee emp : listOfEmp) 
   									{
   										System.out.println(emp);
 		    	
   									}
   									break;
 							
   							case 2: 
   									Collections.sort(listOfEmp,new byname());			// using comparator 
   									System.out.println();
   									System.out.println("After Sort");
   									Collections.reverse(listOfEmp);
   									for(employee emp : listOfEmp) 
   									{
   										System.out.println(emp);
	    	
   									}
   									break;
   							}
   							break;
           		case 3:
           					System.out.println("Enter Your Choice :");
           					c = sc.nextInt();
           					switch(c)
           					{
           					case 1: 	
           							Collections.sort(listOfEmp,new bysalary());			// using comparator 
           							System.out.println();
 							System.out.println("After Sort");
 							for(employee emp : listOfEmp) 
 							{
 								System.out.println(emp);
 							
 							}
 							break;
 							
   					case 2: 
 							Collections.sort(listOfEmp,new bysalary());			// using comparator 
 							System.out.println();
 							System.out.println("After Sort");
 							Collections.reverse(listOfEmp);
 							for(employee emp : listOfEmp) 
 							{
 								System.out.println(emp);
	    	
 							}
 							break;
   					}
   					break;
           
           		default:
        	
					System.out.println("invalid option");
					break;
           }
	       System.out.println("Do You Want to Continue: press  1 /t press 0 ");
	        ch=sc.nextInt();
		 	}while(ch!=0);	}
}
