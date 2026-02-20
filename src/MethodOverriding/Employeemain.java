package MethodOverriding;

public class Employeemain {
	
	public static void main(String[]args) {
	Employee e;
	e = new Manager();
	e.calculateSalary();
	
	e = new Developer();
	e.calculateSalary();
	
}
}
