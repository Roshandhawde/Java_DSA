package Arrays_String;

import java.util.Arrays;

public class PairSum {
static int[] sumOfPair(int[] arr, int target){
    int i=0, j=arr.length-1;
    int[] result = new int[2];

    while(i<j){
        int sum =arr[i]+arr[j];
        if( sum==target){
            result[0]=arr[i];
            result[1]=arr[j];
            break;

        }else if(sum< target) {
            i++;
        }else{
            j--;
        }
    }
return result;
}
    public static void main(String[] args) {
    int[] val={1, 2, 4, 7, 11, 15};

        int[] res = sumOfPair(val, 11);

        System.out.println(Arrays.toString(res));
    }
}
