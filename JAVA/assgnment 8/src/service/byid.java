package service;

import java.util.Comparator;

import bean.employee;

public class byid implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		return o1.getId()-o2.getId();
	}
}
