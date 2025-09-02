package Arrays_String;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9,0};
        int left=0, right= arr.length-1;
        int target=7;
        int result = -1;
        while(left<=right){
            if(arr[right]==target){result=right;
                break;
            };
            if(arr[left]==target) {
                result = left;
                break;

            }
            left++;
            right--;
            
        }
        System.out.println(result+"---------"+arr[result]);
        System.out.println("inBuilt Function : "+Arrays.binarySearch(arr, target));

    }
}
