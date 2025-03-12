package Day46;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AdvanceArrayPartOne {
    public static void PrefixArray(int[] arr){
        int n = arr.length;
        int[] prefixArray = new int[n];
        prefixArray[0]=arr[0];
        System.out.print(prefixArray[0]+" ");
        for(int i = 1;i<n;i++){
            prefixArray[i] = prefixArray[i-1]+arr[i];
            System.out.print(prefixArray[i]+" ");
        }
    }

    public static void SumBetweenStartAndEnd(){
        int[] arr = {2,3,5,-1,6};
        int n = arr.length;
        int[] prefixArray = new int[n];
        int left = 1,right=3;
        prefixArray[0]=arr[0];
        for(int i =1;i<arr.length;i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
            System.out.print(prefixArray[i] + " ");
        }
        if(left==0){
            System.out.println(prefixArray[right]);
        }else {
            System.out.println(prefixArray[right]-prefixArray[left-1]);
        }
    }

    public static void AllElementsZero(){
        int[] arr = {0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("How many queries do you want to add:");
        int queries = sc.nextInt();

        while(queries!=0){
            System.out.println("Enter an index");
            int index = sc.nextInt();
            System.out.println("Enter an value");
            int value = sc.nextInt();
            for(int i = index;i<arr.length;i++){
                arr[i] = arr[i] + value;
            }
            queries--;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void AllElementsZeroUsingPrefixArray(){
        int[] arr = {0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("How many queries do you want to add:");
        int queries = sc.nextInt();

        while(queries!=0){

            System.out.println("Enter an index");
            int index = sc.nextInt();
            System.out.println("Enter an value");
            int value = sc.nextInt();

            arr[index] = arr[index] + value;
            queries--;
        }
        System.out.println("After adding the values to respective index, we got array below:");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n Now we will take the prefix array for the above array:");
//        int n = arr.length;
//        int[] prefixArray = new int[n];
//        prefixArray[0]=arr[0];
//        System.out.print(prefixArray[0]+" ");
//        for(int i = 1;i<n;i++){
//            prefixArray[i] = prefixArray[i-1]+arr[i];
//            System.out.print(prefixArray[i]+" ");
//        }
        PrefixArray(arr);
    }
    public static void AllElementsZeroStartEndValue(){
        int[] arr = {0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("How many queries do you want to add:");
        int queries = sc.nextInt();

        while(queries!=0){

            System.out.println("Enter start index");
            int startIndex = sc.nextInt();
            System.out.println("Enter an end index");
            int endIndex = sc.nextInt();
            System.out.println("Enter an value");
            int value = sc.nextInt();
            for(int i=startIndex;i<=endIndex;i++) {
                arr[i] = arr[i] + value;
            }
            queries--;
        }
        System.out.println("After adding the values to respective index, we got array below:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void AllElementsZeroStartEndValueWithPrefixArray(){
        int[] arr ={0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("How many qurires?: ");
        int queries = sc.nextInt();
        while(queries!=0){
            System.out.println("Enter start index");
            int startIndex = sc.nextInt();
            System.out.println("Enter an end index");
            int endIndex = sc.nextInt();
            System.out.println("Enter an value");
            int value = sc.nextInt();

                arr[startIndex] = arr[startIndex]+value;
                arr[endIndex+1] = arr[endIndex+1]-value;

            queries--;
        }
        System.out.println("After adding the values to respective index, we got array below:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n Now we will take the prefix array for the above array:");
//        int n = arr.length;
//        int[] prefixArray = new int[n];
//        prefixArray[0]=arr[0];
//        System.out.print(prefixArray[0]+" ");
//        for(int i = 1;i<n;i++){
//            prefixArray[i] = prefixArray[i-1]+arr[i];
//            System.out.print(prefixArray[i]+" ");
//        }
        PrefixArray(arr);
    }

    public static void PrefixMinimumMaximumArray(){
        int[] arr = {2,-1,3,5,-2,0,-10};
        int n = arr.length;
        int[] prefixMin = new int[n];
        prefixMin[0] = arr[0];
        System.out.println("Prefix Minimum Array:");
        System.out.print(prefixMin[0]+" ");
        for(int i = 1;i<arr.length;i++){
            prefixMin[i] = Math.min(prefixMin[i-1],arr[i]);
            System.out.print(prefixMin[i]+" ");
        }

        System.out.println("\nPrefix Maximum Array:");
        int[] prefixMax = new int[n];
        prefixMax[0] = arr[0];
        System.out.print(prefixMax[0]+" ");
        for(int i = 1;i<arr.length;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],arr[i]);
            System.out.print(prefixMax[i]+" ");
        }
    }
    public static void SuffixMinimumMaximumArray(){
        int[] arr = {2,-1,3,5,-2,0,-10};
        int n = arr.length;
        int[] suffixMin = new int[n];
        suffixMin[n-1] = arr[n-1];
        System.out.println("\nSuffix Minimum Array");
        //System.out.print(suffixMin[n-1]+" ");
        for(int i = n-2;i>=0;i--){
            suffixMin[i] = Math.min(suffixMin[i+1],arr[i]);

        }
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(suffixMin[i]+" ");
        }

        System.out.println("\nSuffix Maximum Array");
        int[] suffixMax = new int[n];
        suffixMax[n-1] = arr[n-1];
       // System.out.print(suffixMax[n-1]+" ");
        for(int i = n-2;i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1],arr[i]);

        }
        for (int i = 0 ;i<arr.length;i++){
            System.out.print(suffixMax[i]+" ");
        }
    }
    public static void MaximumSubarray(){
        int[] arr = {3,2,-6,8,2,9,4};
        int sum = 0, ans = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("Maximum Subarray : "+ans);
    }

    public static void RiverWaterTrapped(){
        int[] arr = {2,1,3,2,1,2,4,3,2,1,3,1};
        int n = arr.length;
        //now first we have to find the prefixMax array
        int[] prefixMax = new int[n];
        System.out.println("First we have to find the Prefix Max");
        prefixMax[0] = arr[0];
        System.out.print(prefixMax[0]+" ");
        for(int i = 1;i<n;i++){
            prefixMax[i] = Math.max(prefixMax[i-1],arr[i]);
            System.out.print(prefixMax[i]+" ");
        }
        System.out.println();
        System.out.println("Now we have to find Suffix Max");
        int m = arr.length;
        int[] suffixMax = new int[m];
        suffixMax[m-1] = arr[m-1];
        for(int i=m-2;i>=0;i--){
           suffixMax[i]= Math.max(suffixMax[i+1],arr[i]);
        }
        for(int i =0;i<m;i++){
            System.out.print(suffixMax[i]+" ");
        }
        System.out.println();
        System.out.println("Now lets find the amount ");
        int water=0;
        for(int i =1;i<=arr.length-2;i++){
            int amount = Math.min(prefixMax[i-1],suffixMax[i+1])-arr[i]; // arr[i] is represents here as height of i
            if(amount>0){
                water = water + amount;
            }
        }
        System.out.print("Final Answer: "+water);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Problem 01: Given an array and Q queries. Find sum between start and end
         */
        //SumBetweenStartAndEnd();
        /*................................................................................*/

        /*Problem - 02 Given an array containing all elements zero. Take index and value from user
        need to put the value from given index to n-1
        and then all the values as per index and result the same array.
        * */
        //AllElementsZero(); // here we have used brute force technique.

        /* Same problem as above, we need to put the value only to particular index, no need to go till n-1
        so after inserting the values to particular index, we got new array, take the prefix sum of the new array
        so result is same as above
        * */
        //AllElementsZeroUsingPrefixArray(); // here we have used prefix sum array technique
        /*................................................................................*/

        /*Problem - 03 Given an arrays of 0's
        there are 3 terms - start, end and value
         */
       // AllElementsZeroStartEndValue(); // brute force approach

        //AllElementsZeroStartEndValueWithPrefixArray(); // using prefix array approach
        /*................................................................................*/

        /*Problem : 04
        * Find Prefix minimum of array
        * */
        //PrefixMinimumMaximumArray();
        //SuffixMinimumMaximumArray();
        /*................................................................................*/
        /*Problem : 05
        River Water Trapped
        Given N array elements, a[i] represents height of building
        Return amount of water stored.
         */
        RiverWaterTrapped();

        /*................................................................................*/
        /*Problem : 06 Kadanes Algo
        Given an array find maximum subarray
        */
        //MaximumSubarray();
    }
}
