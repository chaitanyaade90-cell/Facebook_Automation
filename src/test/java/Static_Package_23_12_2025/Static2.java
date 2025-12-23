package Static_Package_23_12_2025;

public class Static2 {
	
	static int number;
	static String name;
	static int salary;
	
	static public void Method4 () {
		System.out.println("My number is " + number);
	}
	
	static public void Method5() {
		System.out.println("My name is " + name);
	}
	
	static public void Method6() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.number=90;
		Static2.name="SBIL";
		Static2.salary=90000;
		
		Static2.Method4();
		Static2.Method5();
		Static2.Method6();

	}

}
