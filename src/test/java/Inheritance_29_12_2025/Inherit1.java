package Inheritance_29_12_2025;

class student
{
	
	public void college() {
		
		System.out.println("My collage name is YMN");
		
	}
}

class subject extends student{
	
	public void books() {
		
		System.out.println("All are physics student");
	}
}
public class Inherit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subject s1 = new subject();
		s1.college();
		s1.books();

	}

}
