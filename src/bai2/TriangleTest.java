package bai2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    @Test
    public void testTriangle(){
        int a=2;
        int b=2;
        int c=2;
       String expected = "la tam giac deu";
      String  result = TestTriangle.test(a,b,c);
      assertEquals(expected,result);

    }
}
