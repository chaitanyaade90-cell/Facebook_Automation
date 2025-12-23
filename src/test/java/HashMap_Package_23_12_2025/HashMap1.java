package HashMap_Package_23_12_2025;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> StudentAge = new HashMap<>();
		
		StudentAge.put(25, "Insane");
		StudentAge.put(26, "Cavin");
		
		System.out.println(StudentAge.get("Insane"));
		
		for(Integer key : StudentAge.keySet()) {
			System.out.println(key + " " + StudentAge.get(key));
		}
		
		

	}

}
