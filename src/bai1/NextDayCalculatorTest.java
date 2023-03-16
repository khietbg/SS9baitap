package bai1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

 class NextDayCalculatorTest {
     @Test
  public void nextDay1(){
      int day = 25;
      int month = 2;
      String expected = 26 + " / "+ 2;
      String result = FindNextDay.nextDay(day,month);
      assertEquals(expected,result);
     }

}
