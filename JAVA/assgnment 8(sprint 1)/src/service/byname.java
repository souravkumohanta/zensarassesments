package service;

import java.util.Comparator;

import bean.employee;


public class byname implements Comparator<employee> {
		
	@Override
		public int compare(employee e1, employee e2) 
	{
			return e1.getName().compareTo(e2.getName());

	}

}