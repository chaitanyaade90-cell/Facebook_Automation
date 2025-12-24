package Instance_Package_24_12_2025;

public class Instance1 {
	
	int id;
	String name;
	int salary;
	
	public void Software() {
		System.out.println("My id is " + id);
	}
	
	public void Testing () {
		System.out.println("My name is " + name );
	}
	
	public void Functional() {
		System.out.println("My salary is " + salary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Instance1 i1 = new Instance1();
		
		i1.id=90;
		i1.name="Sanity";
		i1.salary=90000;
		
		i1.Software();
		i1.Testing();
		i1.Functional();

	}

}
