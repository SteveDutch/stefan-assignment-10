package com.stevedutch.assignment10.domain;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


public class WeekResponse {
	public WeekResponse(String body) {
		// TODO Auto-generated constructor stub
	}

	public ResponseEntity<String> callApiExampleWeek (Integer numCalories, String diet, 
			String exclusions) {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
									  .queryParam("apiKey", "a58978b828464b0da9dafdd895da9d4c")
									  .queryParam("targetCalories", numCalories)
									  .queryParam("diet", diet)
									  .queryParam("intolerances", exclusions)								  .build()
									  .toUri();
		
		ResponseEntity<String> response = rt.getForEntity(uri, String.class);
		System.out.println(response);
		System.out.println(response.getBody());
		WeekResponse responseTest = new WeekResponse(response.getBody());
		System.out.println(responseTest);
		return response;
	}

}
