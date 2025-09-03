package MultiThread;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Java8EvenOdd {

    private static Object object =new Object();


    private static IntPredicate evenCond=  value -> value%2==0;

    private static IntPredicate oddCond=  value -> value%2!=0;

    public static void main(String[] args) {
        CompletableFuture.runAsync(()->Java8EvenOdd.printNumber(evenCond));
        CompletableFuture.runAsync(()->Java8EvenOdd.printNumber(oddCond));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public static void printNumber(IntPredicate condition){
        IntStream.rangeClosed(1, 20).filter(condition).forEach(Java8EvenOdd::execute);
    }
    public  static  void execute(int no){
        synchronized (object){
            System.out.println(Thread.currentThread().getName()+" : "+ no);
            object.notify();
            try {
                object.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
