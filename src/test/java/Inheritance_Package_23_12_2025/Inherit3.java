package Inheritance_Package_23_12_2025;

class Exam
{
	public void pen() {
		System.out.println("Student write");
	}
	
}

class Paper extends Exam
{
	
	public void write() {
		System.out.println("Student pass");
	}
}

public class Inherit3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Paper d=new Paper();
		d.pen();
		d.write();

	}

}
