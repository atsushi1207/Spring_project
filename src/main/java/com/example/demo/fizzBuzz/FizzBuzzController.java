package com.example.demo.fizzBuzz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FizzBuzzController {

	@Autowired
	//private static final Object list = null;
	private /*final*/ FizzBuzzService fizzbuzzService;

	/*public FizzBuzzController(FizzBuzzService fizzbuzzService) {
		this.fizzbuzzService = fizzbuzzService;*/

	@GetMapping("/fizzbuzz")
	public String fizzbuzz(Model model) {

		//String result = "";
		List<String> list = fizzbuzzService.generateFizzbuzzList();

		//result = String.ValueOf(fizzbuzzService.);

		model.addAttribute("result", list);

		return "fizzBuzz.html";
	}
}
