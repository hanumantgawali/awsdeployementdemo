package com.example.swaggerdemo;

import java.util.ArrayList;
import java.util.List;

class Employee  {
	String title;
	String name;
	int age;
	double salary;
	Department dept;

	public Employee(String title, String name, int age, double salary, Department dept) {
		super();
		this.title = title;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}



	@Override
	public String toString() {
		return "Employee [title=" + title + ", name=" + name + ", age=" + age + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}


	public static List<Employee> getEmployeeList() {
		List<Employee>emplist=new ArrayList<Employee>();
		  Department sales=new Department("Sales", 1);
		  Department marketing=new Department("Marketing", 2);
		  emplist.add(new Employee("Mr", "Hanumant", 30, 10000, sales));
		  emplist.add(new Employee("Mr", "abc", 22, 20000, sales));
		  emplist.add(new Employee("Mr", "def", 33, 40000, marketing));
		  emplist.add(new Employee("Ms", "ghi", 54, 5000, sales));
		  emplist.add(new Employee("Mr", "cba", 23, 1000, marketing));
		  emplist.add(new Employee("Miss", "imn", 22, 50000, sales));
		  emplist.add(new Employee("Mr", "zxy", 30, 90000, sales));
		  emplist.add(new Employee("Mr", "rst", 30, 20000, sales));
		  emplist.add(new Employee("Mr", "xyz", 32, 40000, marketing));

		  	return emplist;
	}
	

}
