package List_Package_29_12_2025;

import java.util.ArrayList;
import java.util.List;


public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("BlackBoxTesting");
		names.add("Boards");
		names.add("BDD");
		names.add("GBT");
		
		System.out.println("Names starting with 'B' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name = names.get(i);
			
			if(name.startsWith("B")) {
				System.out.println(name);
			}
			
		}
		

	}

}
