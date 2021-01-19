import java.util.*;
import java.io.*;
public class employeeDetails
{



public employeeDetails()
{

  int n=0;
}
String[] name;
String[] id;
double[] salary;
String[] desig;
public void read()
{
    
    
System.out.println("Enter the name , Id , salary , designation : ");
Scanner sc=new Scanner(System.in);

System.out.println("Enter the no of employees  :");
n=sc.nextInt();
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

}

public void sal(double[] salary,int n)
{
for(int i=0;i<n;i++)
{

salary[i]=salary[i]+(.1*salary[i])+((.07*salary[i])-(.05*salary[i]));

}

}

public void bonus(String[] desig,double[] salary,int n)
{

for(int i=0;i<n;i++)
{

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


}
}

public void display(int n)
{
    
for(int i=0;i<n;i++)
{
System.out.println("Name : "+name[i]);
System.out.println("salary : "+salary[i]);
System.out.println("Designation is : "+desig[i]);
}
}
public static void main(String args[])
{

employeeDetails obj=new employeeDetails();

obj.read(m);
obj.sal(salary,m);
obj.bonus(desig,salary,m);
obj.display(m);
}
}