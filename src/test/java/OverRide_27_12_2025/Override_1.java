package OverRide_27_12_2025;

class RunTest{
	
	public void NFR() {
		
		System.out.println("Universal Scenario");
	}

	public void SQMMINION() {
		// TODO Auto-generated method stub
		
	}
}

class SearchResult extends RunTest{
	
	@Override
	
	public void SQMMINION() {
		
		System.out.println("CrossFunctional");
		
	}
}

public class Override_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		RunTest r1 = new  SearchResult();
		
		r1.NFR();
		r1.SQMMINION();
	}

}
