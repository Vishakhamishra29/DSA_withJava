//Problem: Find Even and Odd in given array

public class EvenAndOdd {
    public static void evenAndodd(int arr[]){
      System.out.print("Even is : ");
        for(int i=0;i<arr.length;i++){
          if(arr[i]%2==0){
            System.out.print(arr[i] + " ");
        }
        }
        System.out.println(" ");
        System.out.print("Odd is : ");
        for(int i=0;i<arr.length;i++){
          if(arr[i]%2!=0){
            System.out.print(arr[i] + " ");
        }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,4,5};
        evenAndodd(arr);
    }
}
