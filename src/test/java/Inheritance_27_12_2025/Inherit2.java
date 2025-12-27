package Inheritance_27_12_2025;

class student{
	
	public void learn() {
		
		System.out.println("Students are learning");
	}
}

class book extends student{
	
	public void lab() {
		System.out.println("Students Liabrary");
	}
}

public class Inherit2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book b1 = new book ();
		b1.learn();
		b1.lab();

	}

}
