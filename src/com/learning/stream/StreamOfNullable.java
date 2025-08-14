package com.learning.stream;

import java.util.stream.Stream;

public class StreamOfNullable {

	public static void main(String[] args) {
		String name = null;
		// Using Stream.ofNullable with a non-null value
		Stream<String> stream = Stream.ofNullable(name);
		stream.forEach(str -> System.out.println("Empty Value : " + str));

		String result = Stream.ofNullable(name).map(String::toUpperCase)
				.findFirst().orElse("No Value Present");

		System.out.println("Result : " + result);

	}
}
