package Arrays_String;

import java.util.Arrays;

public class ArrayTraversing {

    public static void main(String[] args) {
        int[] arr= {1,2,43,5};
        int[] resArr= new int[arr.length];
        for (int i= arr.length-1; i>=0; i--){
            resArr[(arr.length-1)-i]=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(resArr));
//        Arrays.stream(arr).reduce(0, );
    }

}
