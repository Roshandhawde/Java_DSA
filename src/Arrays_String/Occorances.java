package Arrays_String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Occorances {
    static void maxOccarance(int[] arr){
        Map<Integer, Integer> occMap= new HashMap<>();
        for(int num: arr){
            occMap.put(num, occMap.getOrDefault(num,0)+1);
        }
        System.out.println(occMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList()));
        List<Integer> list= occMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(list.get(list.size()-2));
        System.out.println(occMap.entrySet());

    }



    public static void main(String[] args) {
        int[] arr ={1,3,2,1,3,4,2,1,3,5,1};
        maxOccarance(arr);
    }

}
