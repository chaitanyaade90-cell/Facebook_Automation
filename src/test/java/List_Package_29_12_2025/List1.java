package List_Package_29_12_2025;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
		
		names.add("Roles");
		names.add("Regression");
		names.add("Responsibilities");
		names.add("Sanity");
		
		System.out.println("Names starting with 'R' ");
		
		for (int i = 0; i < names.size(); i++) {
			
			String name= names.get(i);
			
			if(name.startsWith("R")) {
				System.out.println(name);
			}
			
		}
		

	}

}
