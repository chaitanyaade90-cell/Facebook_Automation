package Override_package_28_12_2025;

class Gold
{
	
	public void Gram() {
		System.out.println("Gold price is 1 lakh");
	}

	public void Kilo() {
		// TODO Auto-generated method stub
		
	}
}

class Silver extends Gold{
	
	@Override
	
	public void Kilo() {
		
		System.out.println("Silver price is 2 lakh");
	}
}

public class Override1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Silver s1 = new Silver();
		s1.Gram();
		s1.Kilo();

	}

}
