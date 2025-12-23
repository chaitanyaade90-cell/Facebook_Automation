package Constructor_23_12_2025;

import java.lang.reflect.Constructor;

public class Constructor1 {
	
	String name;
	int age;
	
	public Constructor1(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	void Student (String n , int a ){
		
		name= n;
		age = a;
	}
	
	void display() {
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor1 s1 = new Constructor1("Alice", 15);
		s1.display();
		
		

	}

}
