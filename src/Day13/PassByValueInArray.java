package Day13;

import java.util.Arrays;

public class PassByValueInArray {
    public static void func(int[] arr){
      for(int i = 0;i<arr.length;i++){
          arr[i] = arr[i]*10;
      }
        System.out.println(Arrays.toString(arr));
    }
    public static int search(int[] arr, int key){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return 0 ;
    }
    public static int largestElement(int[] arr){
       int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10,50,30,40,500};
        // System.out.println("Before : "+Arrays.toString(arr));
        // func(arr);
        // System.out.println("After : "+Arrays.toString(arr));
        //  String str = search(arr, 50) ? "Yes" : "No ";
        // System.out.println(str);
        // int ind =  search(arr,50);
        // System.out.println(ind + " ");
        System.out.println("Largest Number in Array: "+largestElement(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Largest "+ arr[arr.length-1]);
    }
}
