package array;

public class sumOfArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n= arr.length;
        sum(arr,n);
    }
    static void sum(int arr[],int n){
        int result=0;
        double avg = 0;
        for(int x=0;x<n;x++){
            result+=arr[x];
            avg= result/n;
        }
        System.out.println("sum is "+ result);
        System.out.println("avg is "+ avg);

    }
}
