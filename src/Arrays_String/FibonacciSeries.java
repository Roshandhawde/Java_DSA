package Arrays_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FibonacciSeries {
    static void fibonacci(int n){
        List<Integer> fibo= new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        int i=0;
        while (i<n-1){
            fibo.add(fibo.get(i)+fibo.get(i+1));
            i++;
        }
        System.out.println(fibo);


    }



    public static void main(String[] args) {
        fibonacci(10);

    }
}
