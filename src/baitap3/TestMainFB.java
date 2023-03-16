package baitap3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMainFB {
    @Test
    void TestFB(){
        int num = 15;
        String expected = "FizzBuzz";
        String result = TestFB.test(num);
        assertEquals(expected,result);
    }
}
