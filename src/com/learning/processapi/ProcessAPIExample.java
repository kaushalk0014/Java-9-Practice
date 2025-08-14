package com.learning.processapi;

import java.lang.ProcessHandle.Info;

public class ProcessAPIExample {

	public static void main(String[] args) {
		ProcessHandle processHandle = ProcessHandle.current();
		
		Info info = processHandle.info();
	
		System.out.println("Complete Process Informaion info : "+ info);
		System.out.println(info.user().get());
		System.out.println(info.command().get());
		System.out.println(info.startInstant().get());
		System.out.println(info.totalCpuDuration().get());
	}
}
