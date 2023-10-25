package com.example.demo.AnimalsAPI.AnimalsAPIController;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.AnimalsAPIService.AnimalsService;
import com.example.demo.sampleAPI.sampleAPIDate.Animals;

@Controller
public class AnimalsController {

	private final AnimalsService animalsservice;

	public AnimalsController(AnimalsService animalsservice) {
		this.animalsservice = animalsservice;
	}

	@GetMapping("/animalssearch")
	public String index() {
		
		return "animalssearch";
	}

	@GetMapping("/animalsdetail")
	public String getAnimals(@RequestParam("animalssearch")String animalId, Model model) throws IOException {

		Animals[] animalsDetil = animalsservice.getAnimalById(animalId);

		model.addAttribute("animalsDetail", animalsDetil);

		return "animalsdetail";
	}

}
