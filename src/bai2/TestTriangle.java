package bai2;

public class TestTriangle {
    public static String test(int a,int b,int c){
        String result= null;
        if (a>0&&b>0&&c>0&& a+b>c&&a+c>b&&b+c>a){
            if (a==b&&b==c&&a==c){
                result = "la tam giac deu";
            } else if (a==b||b==c||a==c) {
                result = "la tam giac can";
            } else if (a*a==b*c||b*b==a*c||c*c==a*b) {
                result = "la tam giac vuong";
            }else {
                result = "la tam giac";
            }


        }
        return result;
    }
}
