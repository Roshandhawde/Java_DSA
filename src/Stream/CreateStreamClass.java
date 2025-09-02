package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamClass {

    public static void main(String[] args) {

        //From Collection
        List<String> list= Arrays.asList("one", "two", "three");
        Stream<String> stream= list.stream();
        stream.forEach(System.out::println);


        // From Arrar

        String[] array= {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);
        stream1.forEach(System.out::println);

        //USing StreamOf

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6);

    }
}
