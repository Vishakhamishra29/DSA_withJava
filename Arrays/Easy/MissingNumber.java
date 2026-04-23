import java.util.*;
//Given an array of size n-1 containing distinct integers in the range 1 to n, find the missing number.
public class MissingNumber {
    public static void missingNumber(int arr[]){
        int n=arr.length+1;
        int total_sum= n*(n+1)/2;
        int expected_sum=0;
        for(int i=0;i<arr.length;i++){
            expected_sum+=arr[i];
        }
        int missingnumber=total_sum - expected_sum;
        System.out.println("The missing number is : " + missingnumber);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        missingNumber(arr);
    }
}
