package array;

import java.util.Arrays;

public class rotateArray {
    static void swap(int arr[],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotate(int arr[],int k){

        int n=arr.length;
        k=k%n;// In case k is greater than n

        // Step 1: Reverse the whole array
        swap(arr,0,n-1);

        // Step 2: Reverse first k elements
        swap(arr,0,k-1);

        // Step 3: Reverse remaining n-k elements
        swap(arr,k,n-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;
        System.out.println("Original array: " + Arrays.toString(arr));
        rotate(arr,k);
        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));
    }
}
