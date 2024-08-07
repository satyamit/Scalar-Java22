package Day21;

import java.util.Arrays;

public class GreaterItself {
    /*Problem 1
    * Given an array element, count no of elements which have atleast one element greater than itself
    *
    * from above problem statements, we can see , greatest ele of array will not be print or counted.
    * means if we subtract max elements from total array elements will get the expected answer
    * */

    public static void Problem1(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    /*Problem 2
    *Given an array check if sum of array pair of different elements is equal to k
    * */
    public static boolean Problem2(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==k){
                    return  true;
                }
            }
        }
        return false;
    }

    /*
    * Problem 3:
    * Given an array Reverse the elements
    *
    * */
    public static void Swap(int i,int j){

    }
    public static void Problem3(int[] arr){
       int i = 0,j=arr.length-1,temp=0;
       while(i<j){
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
           i++;
           j--;
       }
        System.out.println(Arrays.toString(arr));
    }
    /*
    * Problem 4:
    * Given an array and 2 index reverse the array between the two indices?
    *
    * */
    public static void Problem4(int[] arr,int start,int end){
       int temp =0,i=start,j=end;
      while(i<j) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          i++;
          j--;
      }
       System.out.println(Arrays.toString(arr));
    }

    /*
    * Problem 5:
    *Given an array, rotate the array k times from right to left?
    * */

    public static void Problem5(int[] arr,int k){
        int i = 0, j = arr.length-1,temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
        int first_start=0, first_end=arr.length-k-1,second_start=first_end+1,second_end=arr.length-1;
        int temp_first=0;
        int temp_second=0;
        while(first_start<first_end){
            temp_first=arr[first_start];
            arr[first_start]=arr[first_end];
            arr[first_end]=temp_first;
            first_start++;
            first_end--;
        }
       // System.out.println(Arrays.toString(arr));
        while (second_start<second_end){
            temp_second=arr[second_start];
            arr[second_start]=arr[second_end];
            arr[second_end]=temp_second;
            second_start++;
            second_end--;
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr1 = {2,3,5,-1,7,9,3,9,6};
        Problem1(arr1);

        int[] arr2 = {3,-2,5,7,2,-1};
        String result =  Problem2(arr2,12) ? "Yes" : "No";
        System.out.println(result);

        int[] arr3 = {3,4,7,10,-1};
        Problem3(arr3);

        int[] arr4 = {2,3,4,5,7,8,9};
        Problem4(arr4,2,5);

        int[] arr5 = {1,2,3,4,5,6,7,8};
        Problem5(arr5,3);

//      8 7 6 5 4 3 2 1
    }
}
