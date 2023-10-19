package com.example.demo.calculator.calculatorService;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculate(int number1, String operator, int number2) {
		
		switch (operator) {
		case "+":
			return number1 + number2;
		case "-":
			return number1 - number2;
		case "*":
			return number1 * number2;

		default:
			if (number2 != 0) {
				return number1 / number2;

			}
			return 0;
		}

	}

}
