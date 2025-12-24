package Static_package_24_12_2025;

public class Static1 {
	
	static int num;
	static String name;
	static int salary;
	
	static public void Regression() {
		System.out.println("My num is " + num);
	}
	
	static public void Sanity() {
		System.out.println("My name is " + name);
	}
	
	static public void Smoke() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Static1.num=33;
		Static1.name="Carens";
		Static1.salary=90000;
		
		Static1.Regression();
		Static1.Sanity();
		Static1.Smoke();

	}

}
