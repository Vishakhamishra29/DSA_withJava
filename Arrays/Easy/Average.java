import java.util.*;
//Problem:Find the Average of elements in given array

public class Average{
    public static void averageofElement(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg=(double)sum/arr.length;
        System.out.print("The average of elements is : " + avg);
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,5,4};
        averageofElement(arr);
    }
}