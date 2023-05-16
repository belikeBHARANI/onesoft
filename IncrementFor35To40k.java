package com.onesoft.collections;

import java.util.ArrayList;

public class IncrementFor35To40k {
public static void main(String[] args) {
		

		Employee emp1 = new Employee(123,"Bharani",26,'M',25000);
		Employee emp2 = new Employee(124,"Dharan",27,'M',37000);
		Employee emp3 = new Employee(125,"Gopi",35,'M',42000);
		Employee emp4 = new Employee(126,"Ashok",30,'M',40000);
		Employee emp5 = new Employee(127,"Habi",29,'M',32000);
		Employee emp6 = new Employee(128,"Dharani",27,'F',30000);
		Employee emp7 = new Employee(129,"Priya",27,'F',27000);
		Employee emp8 = new Employee(130,"Selva",40,'M',39000);
		Employee emp9 = new Employee(131,"Shri",40,'F',55000);
		Employee emp10 = new Employee(132,"Vijay",40,'M',42000);
		
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(emp1);
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		emps.add(emp6);
		emps.add(emp7);
		emps.add(emp8);
		emps.add(emp9);
		emps.add(emp10);
		
		for(Employee x:emps) {
			if(x.getSalary()>40000) {
		x.setSalary(x.getSalary()+(x.getSalary()*5/100));
			}
			System.out.println(x);
		}
		
}

}
