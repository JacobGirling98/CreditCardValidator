package com.exercise.validator;

import java.util.Arrays;

public class CreditCardValidator {

	public int sumDigits(int numberToDouble) {
		if (numberToDouble > 9) {
			String numberAsString = String.valueOf(numberToDouble);
			char firstChar = numberAsString.charAt(0);
			char secondChar = numberAsString.charAt(1);
			numberToDouble = Integer.parseInt(String.valueOf(firstChar)) + Integer.parseInt(String.valueOf(secondChar));
		}
		return numberToDouble;
	}

  public boolean validate(int[] numbers) {
    for (int i = numbers.length - 1; i >= 0; i--) {
			if (i % 2 == 1) {
				numbers[i] *= 2;
				numbers[i] = sumDigits(numbers[i]);
			}
		}
		return Arrays.stream(numbers).sum() % 10 == 0;
  }
}