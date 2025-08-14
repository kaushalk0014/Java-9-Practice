package com.learning.stream;

import java.util.Set;

public class StreamFactoryMethodSet {

	public static void main(String[] args) {
		Set<String> set = Set.of("Spring", "Java", "React Js", "JavaScript", "Bootstrap");
		
		set.forEach(System.out::println);
		// We can't add new elements to the set because it is immutable
		//set.add("Hibernate"); // This will throw UnsupportedOperationException because Set.of() creates an immutable set
	}
}
