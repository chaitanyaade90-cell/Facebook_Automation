package InstancePackage_23_12_2025;

public class Instance1 {
	
	int id; 
	String name;
	int salary;
	
	public void Method() {
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
		
		Instance1 i1 = new Instance1();
		i1.id=22;
		i1.name="Axa";
		i1.salary=90000;
		
		i1.Method();
		i1.Method2();
		i1.Method3();

	}

}
