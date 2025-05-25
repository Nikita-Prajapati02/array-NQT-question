package array;
//Find Median of the given Array
import java.util.Arrays;

public class medianArray {
    public static void main(String[] args) {
        int arr[] = {56,87,43,12,45,90};
        int n = arr.length;
        middle(arr,n);
    }

    static void middle(int arr[],int n){
        Arrays.sort(arr);
        if(n%2==0){
            int idx1 = (n/2)-1;
            int idx2 = n/2;
            System.out.println((double)(arr[idx1]+arr[idx2])/2 );
        }
        else{
            System.out.println((double)(arr[n]/2 ));
        }
    }
}
