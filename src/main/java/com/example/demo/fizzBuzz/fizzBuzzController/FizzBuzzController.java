package com.example.demo.fizzBuzz.fizzBuzzController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.fizzBuzzService.FizzBuzzService;

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
