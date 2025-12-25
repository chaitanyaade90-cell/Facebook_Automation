package Overloading_package_25_12_2025;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

class RunTest{
	
	public void E2E() {
		
		System.out.println("Universal Scenario");
	}

	public void NonfunctionalTesting() {
		// TODO Auto-generated method stub
		
	}
}

class CrossFunctional extends RunTest{
	
			@Override
			
			public void NonfunctionalTesting() {
				
				System.out.println("Functional Testing");
					
	}
}

public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunTest r1 = new CrossFunctional();
		
		r1.E2E();
		
		

	}

}
