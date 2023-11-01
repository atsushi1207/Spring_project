package com.example.demo.animals.animalsService;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.animals.animalsRepository.AnimalsRepository;
import com.example.demo.sampleAPI.sampleAPIDate.Animals;

@Service
public class AnimalsService {

	private final AnimalsRepository animalsRepository;

	public AnimalsService(AnimalsRepository animalsRepository) {
		this.animalsRepository = animalsRepository;
	}

	public List<Animals> getAnimalsName() throws IOException {
		
		Animals[] animalsList = animalsRepository.getAnimalsName();
		
		return Arrays.asList(animalsList);
	}
	
	public Animals[] getAnimalById(String animalId) throws IOException {
		
		return animalsRepository.getAnimalsById(animalId);
	}

}
