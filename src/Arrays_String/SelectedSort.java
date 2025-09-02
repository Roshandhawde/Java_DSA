package Arrays_String;

import java.beans.Introspector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectedSort {
    public static void sort (int[] arr){

        int min;
        for(int i=0; i<arr.length; i++){
            min=arr[i];
            int minIndex=0;
            for(int j=i; j<arr.length; j++) {
                if (arr[j] < min && arr[j] >= 0) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex]=arr[i];
            arr[i]=min;
            System.out.println(min);
        }


    } ;

    public static void main(String[] args) {
int[] arra= {4,3,1,6,9,3,4,7,8,9,3,87,0,0};
sort(arra);
    }
}
