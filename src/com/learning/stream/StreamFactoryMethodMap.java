package com.learning.stream;

import java.util.Map;

public class StreamFactoryMethodMap {
 
	public static void main(String[] args) {
		Map<String, String> map = Map.of("Spring", "5",
				"Java", "9", "React Js ", "6",
				"JavaScript", "7", "Bootstrap", "5");
		
		
		map.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});
		
		//We can't add new elements to the map because it is immutable
		map.put("Hibernate", "8"); // This will throw UnsupportedOperationException because Map.of() creates an immutable map
		
	}
}
