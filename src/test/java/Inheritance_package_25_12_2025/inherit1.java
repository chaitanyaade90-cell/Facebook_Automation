package Inheritance_package_25_12_2025;

class student{
	
	public void Class() {
		
		System.out.println("Student are appear for exam");
	}
	
}

class College extends student{
	
	public void Liabrary() {
		
		System.out.println("Students are not appear fot exam");
	}
}

public class inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s1 = new College();
		s1.Class();
		

	}

}
