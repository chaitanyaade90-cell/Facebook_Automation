package Interface_package_27_12_2025;

interface Company{
	
	public void Designation();
	
}

 class Project implements Company{
	 
	 public void Learning() {
		 
		 System.out.println("Employees are on Learning phase");
		 
	 }

	 
	 public void Designation() {
		// TODO Auto-generated method stub
		
	 }
	
}

public class Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company c1 = new Project();
		c1.Designation();

	}

}
