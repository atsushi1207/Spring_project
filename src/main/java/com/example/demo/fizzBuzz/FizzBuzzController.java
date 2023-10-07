package com.example.demo.fizzBuzz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {

	@Autowired
	private FizzBuzzService fizzbuzzService;

	@GetMapping("/fizzbuzz")
	public String fizzbuzz(Model model) {

		List<String> list = fizzbuzzService.generateFizzbuzzList();

		model.addAttribute("result", list);

		return "fizzBuzz.html";
	}
}
