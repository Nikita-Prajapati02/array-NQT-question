//Find the smallest element in an array
package array;

import java.sql.SQLOutput;
import java.util.Arrays;

public class smallestNumber {
   public static int smallerNumber(int arr[]){
        Arrays.sort(arr);


        return  arr[0];
    }

    public static void main(String[] args) {
        int arr[] = {67,78,54,90,32,23};
        System.out.println(smallerNumber(arr));


    }
}
