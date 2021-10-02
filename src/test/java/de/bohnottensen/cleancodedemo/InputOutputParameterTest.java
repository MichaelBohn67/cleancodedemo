package de.bohnottensen.cleancodedemo;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class InputOutputParameterTest {

  @Test
  void givenBigDecimalAddValueOfFive(){
    InputOutputParameter inout = new InputOutputParameter();
    BigDecimal number = BigDecimal.valueOf(10L);
    BigDecimal expected = BigDecimal.valueOf(15L);
    BigDecimal result = inout.addFive(number);
    assertThat(result, is(expected));
    BigDecimal result2 = inout.addFive(number);
    assertThat(result2, is(expected));
  }

  @Test
  void givenStringBuilderAppendNewString() {
    InputOutputParameter inout = new InputOutputParameter();
    StringBuilder builder = new StringBuilder();
    builder.append("Hallo Freunde!");
    StringBuilder result = inout.getString(builder);
    assertThat(result.toString(), is("Hallo Ilja!"));
    assertThat(builder.toString(), is("Hallo Freunde!"));
  }
}