package com.example.demo.animalsapi.animalsapiservice;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animalsapi.animalsapirepository.AnimalsRepository;
import com.example.demo.sampleAPI.sampleAPIDate.Animals;

@Service
public class AnimalsService {

	private final AnimalsRepository animalsrepository;

	public AnimalsService(AnimalsRepository animalsrepository) {
		this.animalsrepository = animalsrepository;
	}

	public List<Animals> getAnimalsName() throws IOException {
		
		Animals[] animalsList = animalsrepository.getAnimalsName();
		
		return Arrays.asList(animalsList);
	}
	
	public Animals[] getAnimalById(String animalId) throws IOException {
		
		return animalsrepository.getAnimalsById(animalId);
	}

}