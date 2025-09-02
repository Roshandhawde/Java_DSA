package Arrays_String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// bubble sort compares b/w two string and swaps then


public class BubbleSort {
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }
    public static void sortDesc(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 2, 4, 3, 2, 6, 2, 9, 2, 1, 6, 2, 2, 1, 8, 9, 966, 53, 9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        sortDesc(arr);
        System.out.println(Arrays.toString(arr));

    }
}
