package Try_Catch_package_27_12_2025;

public class trycatch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10000;
		int b = 5000;
		
		int c = a/b;
		
		try{
			
			int employee = 10000/0;
			
		}catch(ArithmeticException e) {
			System.out.println("Employee applicable for Insurance");
		}

	}

}
