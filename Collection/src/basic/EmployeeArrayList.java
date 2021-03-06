package basic;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArrayList {
	
	public static void main(String[] args) {
		
		Employee em1 = new Employee(1L,"Sonali",45000);
		Employee em2 = new Employee(2L,"Sandesh",60000);
		Employee em3 = new Employee(3L,"Aadesh",34000);
		Employee em4 = new Employee(4L,"Bhoomika",17000);
		Employee em5 = new Employee(5L,"Prajkta",22000);
		Employee em6 = new Employee(6L,"Guatami",23000);
		Employee em7 = new Employee(7L,"Divesh",24000);
		Employee em8 = new Employee(8L,"Vrushal",25000);
		Employee em9 = new Employee(9L,"Viraj",23500);
		Employee em10 = new Employee(10L,"Ashwini",21000);
		
		List<Employee> allemp = new ArrayList<>();
		allemp.add(em1);
		allemp.add(em2);
		allemp.add(em3);
		allemp.add(em4);
		allemp.add(em5);
		allemp.add(em6);
		allemp.add(em7);
		allemp.add(em8);
		allemp.add(em9);
		allemp.add(em10);
		
		List<Employee> High_salary = new ArrayList<>();
		List<Employee> Low_salary =new ArrayList<>();
		
		for(Employee emp : allemp)
		{
			if(emp.getSalary() >= 25000)
			{
				High_salary.add(emp);
			}
			else
			{
				Low_salary.add(emp);
			}
		}
		
		System.out.println("High_Salary Employees : "+High_salary);
		System.out.println("Lower_Salary Employees : "+Low_salary);
	}

}
