package Instance_Package_23_12_2024;

public class Instance2 {
	
	int id;
	String name;
	int salary;
	
	public void WBT() {
		System.out.println("My id is " + id);
	}
	
	public void BBT() {
		System.out.println("My name is " + name);
	}
	
	public void GBT() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance2 i2=new Instance2();
		i2.id=11;
		i2.name="AXA";
		i2.salary=100000;
		
		i2.WBT();
		i2.BBT();
		i2.GBT();
		
		

	}

}
