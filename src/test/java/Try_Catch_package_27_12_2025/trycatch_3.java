package Try_Catch_package_27_12_2025;

public class trycatch_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 500;
		int b= 200;
		
		int c = a/b;
		
		try {
		
		int car = 500/0;
		
		}catch (ArithmeticException e) {
			System.out.println("All cars are automatic");
		}
		
	}

}
