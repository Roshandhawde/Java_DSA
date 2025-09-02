package Arrays_String;

import java.util.Arrays;

public class RotateArray {
    static void arrRotate(int[] arr, int target){
        int j=0;
        while (j<target) {
            int last = arr[arr.length-1];
            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
            j++;
        }


    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target=3;
        String x= "Roshan";

        arrRotate(arr, target);
        System.out.println(Arrays.toString(arr));
    }
}
