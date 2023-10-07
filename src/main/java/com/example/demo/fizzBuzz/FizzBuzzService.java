package com.example.demo.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public List<String> generateFizzbuzzList() {
		List<String> list = new ArrayList<>();
		for (int num = 0; num <= 100; num++) {
			if (num % 3 == 0 && num % 5 == 0) {
				list.add("FizzBuzz");
			} else if (num % 3 == 0) {
				list.add("Fizz");
			} else if (num % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(String.valueOf(num));
			}
		}
		return list;
	}
}
