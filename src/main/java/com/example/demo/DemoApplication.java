package com.example.demo;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		try {
			String jsonString = "{\"field1\" : 1}";

			InputStream credentialsJSON = new ByteArrayInputStream(jsonString.getBytes(StandardCharsets.UTF_8));
			GoogleCredential credential = GoogleCredential.fromStream(credentialsJSON, null, null);

			System.out.println(credential);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
