package Static2;

public class Static2 {
	
	static int id;
	static String name;
	static int salary;
	
	static public void BBT() {
		System.out.println("My id is " + id);
	}
	
	static public void GBT() {
		System.out.println("My name is " + name);
		
	}
	
	static public void QA() {
		System.out.println("My salary is " + salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static2.id=999;
		Static2.name="Wipro";
		Static2.salary=90000;
		
		Static2.BBT();
		Static2.GBT();
		Static2.QA();

	}

}
