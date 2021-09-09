package com.exercise.validator;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CreditCardValidatorTest {
  
  CreditCardValidator validator = new CreditCardValidator();

  @Test
  public void validNumberReturnsTrue() {
    int[] numbers = {4, 9, 9, 2, 7, 3, 9, 8, 7, 1, 6};
    assertThat(validator.validate(numbers), is(true));
  }

  @Test
  public void invalidNumberReturnsFalse() {
    int[] numbers = {5, 9, 9, 2, 7, 3, 9, 8, 7, 1, 6};
    assertThat(validator.validate(numbers), is(false));
  }
}
