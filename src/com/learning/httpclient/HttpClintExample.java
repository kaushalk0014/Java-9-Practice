package com.learning.httpclient;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClintExample {
	public static void main(String[] args) {
		HttpClient client = HttpClient.newHttpClient();
		
		// Create a request to a URL
		try {
			HttpRequest request = HttpRequest.newBuilder()
					.uri(new URI("https://api.restful-api.dev/objects"))
					.GET()
					.build();
			
			HttpResponse<String> response =
			          client.send(request, HttpResponse.BodyHandlers.ofString());

			System.out.println("Response Status Code : " + response.statusCode());
			System.out.println("Response Body : "+response.body());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
