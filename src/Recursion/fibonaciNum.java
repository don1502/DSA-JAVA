package Recursion;

public class fibonaciNum {
    public static void main(String[] args) {
        System.out.print(fibonaci(6));
        // 0+1+1+2+3+5+8 ----> return 8 as answer
    }

    static int fibonaci(int n){
        if (n < 2){
            return n;
        }
        return fibonaci(n-1) + fibonaci(n-2);
    }
}
