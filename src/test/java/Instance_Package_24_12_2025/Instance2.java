package Instance_Package_24_12_2025;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void Method1() {
		System.out.println("My id is " + id);
	}
	
	public void Method2() {
		System.out.println("My name is " + name);
	}
	
	public void Method3() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		i2.id=88;
		i2.name="CityBannk";
		i2.salary=80000;
		
		i2.Method1();
		i2.Method2();
		i2.Method3();

	}

}
