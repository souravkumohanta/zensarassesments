package service;
import java.util.Comparator;
import bean.employee;


public class bysalary implements Comparator<employee> {
		
	@Override
		public int compare(employee o1, employee o2) 
	{
		return (int) (o1.getSalary()-o2.getSalary());

	}

}