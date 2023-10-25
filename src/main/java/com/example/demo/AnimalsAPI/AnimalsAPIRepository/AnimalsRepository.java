package com.example.demo.AnimalsAPI.AnimalsAPIRepository;

import java.io.IOException;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.sampleAPI.sampleAPIDate.Animals;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class AnimalsRepository {

	public Animals[] getAnimalsr() throws IOException {
		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi";

		RestTemplate rest1 = new RestTemplate();

		ResponseEntity<String> responseEntity1 = rest1.getForEntity(url, String.class);

		String json = responseEntity1.getBody();

		ObjectMapper mapper = new ObjectMapper();

		Animals[] animalsList = mapper.readValue(json, Animals[].class);

		return animalsList;

	}

	public Animals[] getAnimalsById(String animalId) throws IOException {
		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi?id={id}";

		RestTemplate rest2 = new RestTemplate();

		ResponseEntity<String> responseEntity2 = rest2.exchange(url, HttpMethod.GET, null, String.class, animalId);

		String json = responseEntity2.getBody();

		ObjectMapper mapper = new ObjectMapper();

		Animals[] animalsList = mapper.readValue(json, Animals[].class);

		return animalsList;

	}
}
