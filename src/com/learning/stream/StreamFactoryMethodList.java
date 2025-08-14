package com.learning.stream;

import java.util.List;

public class StreamFactoryMethodList {

		public static void main(String[] args) {
			// Using Stream.of to create a stream of integers
			List<Integer> list = List.of(1, 2, 3, 4, 5);
			
			list.forEach(System.out::println);
			
			//We can't add new elements to the list because it is immutable
			//list.add(10); // This will throw UnsupportedOperationException because List.of() creates an immutable list
				
		}
}
