package de.bohnottensen.cleancodedemo;

import java.math.BigDecimal;

public class InputOutputParameter {

  /**
   * Good Practice Code, parameters are not changed
   * @param param BigDecimal
   * @return BigDecimal
   */
  public BigDecimal addFive(BigDecimal param) {
    param = param.add(BigDecimal.valueOf(5L));
    return param;
  }

  /**
   * Bad Practice Code, the parameter ist changed by the function call!
   * @param builder StringBuilder
   * @return StringBuilder
   */
  public void getString(StringBuilder builder) {
    builder.delete(0,builder.length());
    builder.append("Hallo Ilja!");
  }

}
