package Inheritance_Package_26_12_2025;

class Collage{
	
	public void Student() {
		
		System.out.println("All strudent are in 12th class");
	}
}

class Liabrary extends Collage{
	
	public void Exam() {
		
		System.out.println("All students subjects are Maths");
	}
}

public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collage c1 = new Liabrary();
		
		c1.Student();
		

	}

}
