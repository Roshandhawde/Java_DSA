package Arrays_String;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDup {

    static void unique(int[] arr){
        Set<Integer> unique= new HashSet<>();
        for(int n : arr){
            unique.add(n);
        }
        System.out.println(unique);
        unique.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

    }


    public static void main(String[] args) {
int[] arr ={1, 2, 2, 3, 4, 4, 5};
unique(arr);
        Set<Integer> tree= new TreeSet<>();
        tree.add(1);
        tree.add(2);
        System.out.println(tree);

    }
}
