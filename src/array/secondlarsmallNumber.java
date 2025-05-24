package array;

public class secondlarsmallNumber {

    public static  void getElement(int arr[],int n){

        if(n<2){
            System.out.println(-1);
        }
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int sec_small = Integer.MAX_VALUE;
        int sec_large = Integer.MIN_VALUE;

        for(int i=0; i<n;i++){
            small = Math.min(small,arr[i]);
            large = Math.max(large,arr[i]);
        }

        for(int i=0; i<n;i++){
            if(sec_small > arr[i] && arr[i] != small){
                sec_small=arr[i];
            }
            if(sec_large < arr[i] && arr[i] != large){
                sec_large=arr[i];
            }
        }
        System.out.println("second smallest number :"+ sec_small);
        System.out.println("second largest number :"+ sec_large);


    }

    public static void main(String[] args) {
        int arr[] = {54,78,90,43,31,14};
        int n = arr.length;
        getElement(arr,n);
    }

}
