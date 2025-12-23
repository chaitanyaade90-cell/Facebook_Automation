package InstancePackage_23_12_2025;

public class Instance2 {
	
	int num;
	String name;
	int salary;
	
	public void Public() {
		System.out.println("My num is " + num);
	}
	
	public void Private() {
		System.out.println("My name is " + name);
	}
	
	public void Default() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2 = new Instance2();
		i2.num=90;
		i2.name="BOM";
		i2.salary=90000;
		
		
		i2.Public();
		i2.Private();
		i2.Default();

	}

}
