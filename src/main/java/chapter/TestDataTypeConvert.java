package chapter;

public class TestDataTypeConvert {
    public static void main(String[] args) {
        test('c');
        int i = 1,j=10;
        int a = i++;
        int b = ++j;
        System.out.println(a+" "+i);
        System.out.println(b+" "+j);

        int x = 1;
        for (int k = 0; k < 3; k++) {
            x = x++;
            System.out.println("循环第"+k+"次："+x);
        }
        System.out.println(x);
    }
    public static void test(byte b){
        System.out.println("Byte");
    }
    public static void test(short s){
        System.out.println("Short");
    }
    /*public static void test(char c){
        System.out.println("Char");
    }
    public static void test(int i){
        System.out.println("Int");
    }*/
    public static void test(long l){
        System.out.println("Long");
    }
}
