package parallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,3,2,5,4,8,5,6,9,7,0);


        System.out.println("Using Parallel Stream");
        numbers.stream().parallel().forEach(n-> System.out.println(Thread.currentThread().getName()+" : "+n));


        System.out.println("Using Normal Stream");
        numbers.stream().forEach(n-> System.out.println(Thread.currentThread().getName()+" : " +n));


    }
}
