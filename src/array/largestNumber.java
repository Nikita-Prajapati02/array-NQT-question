//Find the Largest element in an array
package array;

import java.util.Arrays;

public class largestNumber {
    public static int largerNumber(int arr[]){
        Arrays.sort(arr);


        return  arr[arr.length-1] ;
    }

    public static void main(String[] args) {
        int arr[] = {67,78,54,90,32,23};
        System.out.println(largerNumber(arr));


    }
}
