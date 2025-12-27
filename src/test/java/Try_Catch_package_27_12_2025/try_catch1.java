package Try_Catch_package_27_12_2025;

public class try_catch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int student = 100/0 ;
		
		}catch (ArithmeticException e) {
			System.out.println("Can not divide by zero");
		}

	}

}
