package Encapsulation_Package_27_12_2025;

class student{
	
	private int rollNo;
	
	public void setRollNo(int r) {
		rollNo = r;
		
		
	}


public int getrollNo() {
	
	return rollNo;
	
	
}
	
	
}

public class Encapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s = new student();
		s.setRollNo(99);
		System.out.println(s.getrollNo());

	}

}
