import java.util.*;
import java.io.*;
public class asses
{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
boolean flag1=false,flag2=false;int x=0,n;
System.out.println("Welcome to the exam");
int k=3;
do{
System.out.println("which exam would you like to give 1.english 2.Maths 3.GK :");
n=sc.nextInt();

switch(n)
{
case 1:
{
System.out.println("English exam:");
if(flag1==true)
{
System.out.println("You have already given this exam");
continue;
}
else
{
System.out.println("Q1. spell verb in german : 1-verb 2-ferb 3-sherb ");
int q=sc.nextInt();
if(q==1){x++;}
System.out.println("Q2. smallest complete sentence : 1-me 2-I 3-go ");
int r=sc.nextInt();
if(r==3){x++;}
System.out.println("Q3. Whats the Dot on the i called 1-gola 2-dot 3-article ");
int s=sc.nextInt();
if(s==3){x++;}

flag1=true;
}
break;
}
case 2:
{
System.out.println("Maths exam:");
if(flag2==true)
{
System.out.println("You have already given this exam");
continue;
}
else
{
System.out.println("Q1. what is 2%2 - 1.0 , 2.1 3.2 ");
int q=sc.nextInt();
if(q==1){x++;}

System.out.println("Q2. what is 0/0 - 1.0 2.undefined 3.Infinity ");
int r=sc.nextInt();
if(r==2){x++;}
System.out.println("Q3. What is the value of root of -1 :   1.undefined 2.1 3.0? ");
int s=sc.nextInt();
if(s==1){x++;}

flag2=true;
}
break;
}
case 3:
{
System.out.println("GK exam:");
if(flag3==true)
{
System.out.println("You have already given this exam");
continue;
}
else
{
 System.out.println("Q1. who is the president - 1.sinchan , 2.doremon 3.R N kovid ");
int q=sc.nextInt();
if(q==3){x++;}

System.out.println("Q2. what is a mirrorless camera ? 1.a dslr 2.a chemical camera 3.a normal old school camera ");
int r=sc.nextInt();
if(r==3){x++;}
System.out.println("Q3. who is the pm of UK   1.Boris Johnson 2.Theresa May 3.Donald Trump ");
int s=sc.nextInt();
if(s==1){x++;}

flag3=true;
}
break;
}

default:
 System.out.println("choose valid options ");
break;

}

if(flag1==true&&flag2==true&&flag3==true)
{k=0;}

}while(k>0);

System.out.println("The final score is : "+x);

    
    
}

}