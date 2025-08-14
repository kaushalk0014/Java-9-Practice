package com.learning.trywithresource;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) throws IOException {
		
		//using try-with-resources to automatically close resources with java 
		BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt"));
		//try(BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt"))){
		try( writer){
			writer.write("Spring boot");
			writer.newLine();
			writer.write("Java 9");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
