package Constructor;

public class Person {
	
	String name;
	int age ;
	
	Person(){
		name = "Siddhesh";
		age = 20;
		
	}
	
	public void greet() {
		System.out.println("Hello my name is "+name+ " and My age is "+age);
	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.greet();
		

	}

}
