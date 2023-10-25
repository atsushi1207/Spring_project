package com.example.demo.sampleAPI.sampleAPIRepository;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.demo.sampleAPI.sampleAPIDate.Animals;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class SampleAPIRepository {

	public Animals[] getAnimals() throws IOException {

		String url = "https://jsn9xu2vsk.execute-api.ap-northeast-1.amazonaws.com/sample/sampleapi";

		RestTemplate rest = new RestTemplate();

		ResponseEntity<String> responseEntity = rest.getForEntity(url, String.class);

		String json = responseEntity.getBody();

		ObjectMapper mapper = new ObjectMapper();

		Animals[] animalsList = mapper.readValue(json, Animals[].class);

		return animalsList;
	}
}
