import java.util.*;
import java.io.*;
public class employee
{

public static void main(String args[]) throws IOException
{

Scanner sc=new Scanner(System.in);

System.out.println("Enter the number of records : ");
int n=sc.nextInt();
 String[] name=new String[n];
String[] id=new String[n];
double[] salary=new double[n];
String[] desig=new String[n];

System.out.println("Enter the name , Id , salary , designation : ");

for(int i=0;i<n;i++)
{

System.out.println("Enter name:");
name[i]=sc.next();

System.out.print("Enter salary:  ");
salary[i]=sc.nextDouble();

System.out.println("Enter ID:");
id[i]=sc.next();



System.out.print("Enter designation:  ");
desig[i]=sc.next();
}



for(int i=0;i<n;i++)
{

salary[i]=salary[i]+(.1*salary[i])+((.07*salary[i])-(.05*salary[i]));

if(desig[i].equals("manager"))
{
salary[i]=(.15*salary[i])+salary[i];
}
else if(desig[i]=="developer")
{
salary[i]=(.10*salary[i])+salary[i];
}
else
salary[i]=(.05*salary[i])+salary[i];


System.out.println("Name : "+name[i]);
System.out.println("salary : "+salary[i]);
System.out.println("Designation is : "+desig[i]);
}
}
}


