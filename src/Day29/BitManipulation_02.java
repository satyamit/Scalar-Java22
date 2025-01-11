package Day29;

import java.util.Arrays;

public class BitManipulation_02 {
    public static int[] NumberToBinary(){
        int num = 37;
        int[] binary = new int[6];
        int i =-0;
        while(num!=0){
            binary[i]=num%2;
            num = num / 2;
            i++;
        }
        System.out.println(Arrays.toString(binary));
        for(int j=i-1;j>=0;j--){
            System.out.print(binary[j]);
        }
        System.out.println();
        return binary;
    }
    public static boolean CheckBit(int num1,int i){
        int num = 10101;
        int ith_bit_of_N=3;
        //System.out.println(((num>>ith_bit_of_N)&1)==1);
        return ((num1>>i) & 1) == 1;
    }
    public static void NumberSetBits(){
        // int num[] = NumberToBinary();
        int num = 0b10101;
        int count = 0;
        for(int i=0;i<=31;i++){
            if(CheckBit(num, i)){
                count++;
            }
            System.out.println(count);
        }
        System.out.println("Total Number of Set Bits in "+ num+":- "+ count);
    }
    public static void NumberSetBitsPart02(){
        long num = 0b1010101010101;
        int count =0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println("Total Number of Set Bits in "+ num+":- "+ count);
    }
    public static void SetTheBitPart01(){
        int num = 0b00000000;
        int x = 4,y=3;
        if(x==y){
            System.out.println(1<<x);
        }else{
            System.out.println((1<<x)|(1<<y));
        }
    }
    public static void SetTheBitPart02(){
        int num = 0b10101;
        int bit=0b1;
        System.out.println("num|(1<<bit)"+(num|(1<<bit)));
        System.out.println(Integer.toBinaryString(num|(1<<bit)));
    }
    public static void UnsetTheBit(){
        int num = 0b101011;
        int bit =1;
        System.out.println(num & (~(1<<bit)));
        System.out.println(Integer.toBinaryString(num &(~(1<<bit))));

    }
    public static void SetTheBitInRange(){
        int num = 0b100010010;
        int start = 3,end=5;
        for(int i = start;i<=end;i++){
            num=num|(1<<i);
        }
        System.out.println(Integer.toBinaryString(num));
    }
    public static void main(String[] args) {
                /*Problem 1
        Convert a number to binary
        * */
        NumberToBinary();

        /*Problem 2
        Given N, i check if ith bit of N is set or unset?
        * */
        // CheckBit();

        /*Problem 3
         * Count number of set bits in given number;
         * */
        NumberSetBits();

        /*Problem 4
        in the NumberSetBits(), we have written the condition i<=31 means the range of int is 0-32
        but what if we have to find the same on long, so in that we have to apply while loop logic
        *
        * */
        NumberSetBitsPart02();

        /*Problem 5
        Given a number N, set ith bit of N.
        * */
        SetTheBitPart01();
        SetTheBitPart02();

        /*Problem 6
        Given a number N, Unset ith bit of N
        * */
        UnsetTheBit();

        /*Problem 7
        Set bits in range [i,j]
        * */
        SetTheBitInRange();
    }
}
