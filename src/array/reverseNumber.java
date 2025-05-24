package array;
import java.util.*;
public class reverseNumber {
    public static void main(String[] args) {

        int n = 6;
        int arr[] = {6, 5, 4, 3, 2, 1};
        reverse(arr, n);
    }

     static void reverse(int arr[], int n) {
        int i = 0, j = n - 1;

         while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int p = 0; p < n; p++) {
            System.out.println(arr[p] + " ");
        }

    }
}
