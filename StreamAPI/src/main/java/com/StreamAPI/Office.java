package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> myOffice = new ArrayList<>();

		// adding employees
		myOffice.add(new Employee(101, "Mitul", "Training", 45000));
		myOffice.add(new Employee(102, "Shubham", "HR", 25000));
		myOffice.add(new Employee(103, "Prithwish", "R&D", 85000));
		myOffice.add(new Employee(104, "Sonu", "Sales", 15000));
		myOffice.add(new Employee(105, "Sweety", "Training", 55000));
		myOffice.add(new Employee(106, "Ayan", "Sales", 15000));
		myOffice.add(new Employee(105, "Sweety", "Training", 55000));

		System.out.println("--------------Senior Employees-------------");

		// without using stream API
		ArrayList<Employee> seniorEmp = new ArrayList<>();

		for (Employee emp : myOffice) {
			// filtering
			if (emp.getSalary() > 40000) {

				seniorEmp.add(emp);

			}
			// end of if
		}
		// end of for

		// display using forEach

		seniorEmp.forEach(emp -> System.out.println(emp));

		System.out.println("---------------Junior Employees-------------");
		// with Stream API

		List<Employee> juniorEmp = myOffice.stream().filter(emp -> emp.getSalary() < 40000) // filtering data
				.map(emp -> emp)// fetch data
				.collect(Collectors.toList());// collect in a list

		juniorEmp.forEach(emp -> System.out.println(emp));

		// displaying name dept:Sales

		System.out.println("---------------Sales Dept Employee Names-------------");

		myOffice.stream() // stream
				.filter(emp -> emp.getDept() == "Sales") // filtering
				.forEach(emp -> System.out.println(emp.getEname())); // display names

		// Total salary distributed

		double totalSalaryExpense = myOffice.stream() // stream
				.collect(Collectors.summingDouble(emp -> emp.getSalary())); // collecting salary

		System.out.println("Total Salary expense is :" + totalSalaryExpense);

		// count emp works in Training dep

		long count = myOffice.stream() // stream created
				.filter(emp -> emp.getDept() == "Training") // filter
				.count();

		System.out.println("Number of employees in Training Dept:" + count);

		// convert list to set

		Set<Employee> newOffice = myOffice.stream()// creating a stream
				.map(emp -> emp) // fetch data
				.collect(Collectors.toSet());// collect in set
		System.out.println("---------New Office--------------");

		newOffice.forEach(emp -> System.out.println(emp));

	}

}
