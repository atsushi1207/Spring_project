package com.example.demo.calculator.calculatorController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.calculatorService.CalculatorService;


@Controller
public class CalculatorController {

	
	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("/calculator")
	public String index(Model model) {
		return "calculator.html";
	}

	@PostMapping("cal")
	public String calculate(@RequestParam("number1") int number1, @RequestParam String operator,@RequestParam("number2") int number2,
			 Model model) {
		int result = calculatorService.calculate(number1, operator, number2);
		model.addAttribute("result", result);
		return "calculator.html";
	}

}
