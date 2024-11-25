package Day22;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrefixSum {
    public static void CumulativeArray(int[] arr){
        /*
        * Problem 02 Create an Cumulative Array
        * */
        int sum = 0;
        int[] cummuArr = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
          sum = sum + arr[i];
          cummuArr[i] = sum;
        }
        System.out.println(Arrays.toString(cummuArr));

      // SumOfArrayIndex(cummuArr);
    }
    public static void EquilibriumIndex(int[] arr){
        /*
        * Problem 02 : Given N array elements, count No. of equilibrium indices. An index is said to be equilibrium
        * */
        int sum = 0;
        int[] beforeSum = new int[arr.length];
        int sumOfAllPrevious=0;
        int[] afterSum = new int[arr.length];
        int sumOfAllAfter=0;
        for(int i=0;i<arr.length;i++){
            beforeSum[i] = sumOfAllPrevious;
            sumOfAllPrevious = sumOfAllPrevious + arr[i];
        }
        System.out.println(Arrays.toString(beforeSum));
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               sumOfAllAfter=sumOfAllAfter+arr[j];
           }
           afterSum[i]=sumOfAllAfter;
           sumOfAllAfter=0;
        }
        System.out.println(Arrays.toString(afterSum));
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(beforeSum[i]==afterSum[i]){
                count++;
            }
        }
        if(count>0){
            System.out.println("Equilibrium Index is there...");
        }
    }
    public static void SumOfArrayIndex(int[] arr){

        /*
        * Problem 01: Given N array elements and Q queries on the same array. For each query calculate the sum of elements in a
        * given range [L-R]
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter num of quires:");
        int num_of_queries = sc.nextInt();
        for(int i=0;i<num_of_queries;i++){
            System.out.println("Enter left and right indices");
            int left_array_index = sc.nextInt();
            int right_array_index = sc.nextInt();
            int sum = 0;
            for(int j=left_array_index;j<=right_array_index;j++){
                sum = sum + arr[j];
            }
            System.out.println("sum of array of "+ arr[left_array_index]+" to "+arr[right_array_index]+" is: "+sum);
        }
    }
    public static void PrefixEvenArray(int[] arr){

    }
    public static void main(String[] args) {
//        int[] arr1 = {-3, 2, 5, 6, 7, 8, 9, -1};
//        SumOfArrayIndex(arr1);
         // int[] arr2 = {1,-1,2,3,-1,6,4,5};
//          int[] arr2 = {-3,2,4,-1};
//          CumulativeArray(arr2);
//          int[] arr3 = {-3,2,4,-1};
//          EquilibriumIndex(arr3);
          int[] arr4 = {2,-1,3,4-2,6};
          PrefixEvenArray(arr4);

    }
}
