package Day28;

import java.util.Arrays;

public class BitManipulation_01 {
    public static void FindTheNumber(){
        int[] arr ={1,1,2,2,3,3,5};
        int count=0;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
            }
        }
    }
    public static void FindTheNumberUsingBitwise(){
        //int[] arr = {1,1,2,2,3,3,5};
        int[] arr ={10,1,2,3,4,1,2,3,4};
        int XOR = 0;
        for(int i=0;i<arr.length;i++){
            XOR = XOR ^ arr[i];
        }
        System.out.println(XOR);
    }
    public static void main(String[] args) {
        /*Problem 1:
        Given N numbers where each number is occurring 2 times except one. Find that number.
        * */
        FindTheNumber();
        //System.out.println(0^2);
        /*Problem 2:
        Given N numbers where each number is occurring 2 times except one. Find that number using Bitwise operator.
        * */
        FindTheNumberUsingBitwise();
    }
}
