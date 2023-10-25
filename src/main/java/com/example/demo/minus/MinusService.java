package com.example.demo.minus;

import org.springframework.stereotype.Service;

@Service
public class MinusService {

	public int calculateMinus(int number1, int number2) {

		return number1 - number2;
	}

}