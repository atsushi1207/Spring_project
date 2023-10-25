package com.example.demo.AnimalsAPI.AnimalsAPIService;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.example.demo.AnimalsAPI.AnimalsAPIRepository.AnimalsRepository;
import com.example.demo.sampleAPI.sampleAPIDate.Animals;

@Service
public class AnimalsService {

	private final AnimalsRepository animalsrepository;

	public AnimalsService(AnimalsRepository animalsrepository) {
		this.animalsrepository = animalsrepository;
	}

	public Animals[] getAnimalById(String animalId) throws IOException {
		
		return animalsrepository.getAnimalsById(animalId);
	}
}
