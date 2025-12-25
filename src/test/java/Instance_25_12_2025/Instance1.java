package Instance_25_12_2025;

public class Instance1 {
	
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
		
		Instance1 i1 = new Instance1();
		i1.id=99;
		i1.name="Software";
		i1.salary=90000;
		
		i1.WBT();
		i1.BBT();
		i1.GBT();
		

	}

}
