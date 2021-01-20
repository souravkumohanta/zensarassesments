import java.util.Arrays;
import java.util.Scanner;  
	public class assig7
	{  
	public static void main(String args[])   
	{  
	
	Scanner sc=new Scanner(System.in);
	String[] arr=new String[10];
	
	System.out.print("Entet the string : ");
	for(int i=0;i<10;i++)
	{
		arr[i]=sc.nextLine();
	}
	int size = arr.length;  
	
	for(int i = 0; i<size-1; i++)   
	{  
	for (int j = i+1; j<arr.length; j++)   
	{  
	
	if(arr[i].compareTo(arr[j])>0)   
	{  
	
	String temp = arr[i];  
	arr[i] = arr[j];  
	arr[j] = temp;  
	}  
	}  
	}  
	
	System.out.println(Arrays.toString(arr));  
	}  
	}  


