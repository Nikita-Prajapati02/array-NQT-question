package array;

import java.util.Arrays;

public class insertArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        arr=insertAtBeginning(arr,6);
        arr=insertAtBeginning(arr,7);
        arr=insertAtBeginning(arr,8);
        arr=insertAtEnding(arr,9);
        arr=insertAtEnding(arr,10);
        arr =specificPosition(arr,15,3);
        System.out.println("after inserting"+ Arrays.toString(arr));

    }

    static int[] insertAtBeginning(int arr[],int k){
        int n=arr.length;
        int newArr[]=new int[n+1];
        newArr[0]= k;
        for(int i =0 ;i<n;i++){
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
    static int[] insertAtEnding(int arr[],int k){
        int n=arr.length;
        int newArr[]=new int[n+1];
        for(int i =0 ;i<n;i++){
            newArr[i]=arr[i];
        }
        newArr[n]=k;
        return newArr;
    }
    static int[] specificPosition(int arr[],int k,int indx){
        int n=arr.length;
        int newArr[]=new int[n+1];
        for(int i =0 ;i<indx-1;i++){
            newArr[i]=arr[i];
        }
        newArr[indx-1]=k;
        for(int i=indx-1;i<n;i++){
            newArr[i+1]=arr[i];
        }
        return newArr;
    }
}
