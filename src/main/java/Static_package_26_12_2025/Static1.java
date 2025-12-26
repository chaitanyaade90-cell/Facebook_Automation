package Static_package_26_12_2025;

public class Static1 {
	
	static int id ;
	static String name;
	static int salary;
	
	static public void Automation() {
		System.out.println("My id is " + id);
	}
	
	static public void Manual() {
		System.out.println("My name is  " + name);
	}
	
	static public void SmokeTesting() {
		System.out.println("My salary is");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static1 s1 = new Static1();
		s1.id=11;
		s1.name="AXA";
		s1.salary=90000;
		
		s1.Automation();
		s1.Manual();
		s1.SmokeTesting();

	}

}
