package com.example.demo.minus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MinusController {

	private final MinusService minusService;

	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("/minus")
	public String minusForm() {
		return "minus";
	}

	@PostMapping("/minus")
	public String minusForm(@RequestParam int number1, @RequestParam int number2, Model model) {

		int result = minusService.calculateMinus(number1, number2);

		model.addAttribute("result", result);

		return "minus.html";
	}

}
