package baitap3;

public class TestFB {
    public static String test(int num){
        String result=null;
        if (num%3==0&&num%5==0){
            result = "FizzBuzz";
        } else if (num%3==0) {
            result = "Fizz";
        }else {
            result = "Buzz";
        }
        return result;
    }
}
