package Day18;

import java.util.Scanner;

public class Factors {
    public static int CountFactors(int num){
        int count = 0;
        for(int i = 1 ;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        return count;
    }

    public static int CountFactorsTwo(int num){
        int count=0;
        for(int i =1;i<=Math.sqrt(num);i++){
            if(num%i == 0){ // to check factor
                if(i==num/i){ // 10 == 100/10 so 10 == 10 so count++ else Count+=2;
                    count++;
                }else {
                    count+=2;
                }
            }
        }
        return count;
    }
//number of iteration : sqrt of num

    public static void PerfectSquare(int x){
        for(int i=1;i<x;i++){
            if(i*i==x){
                System.out.println("Perfect Square");
            }
        }
    }
//number of iteration: sqrt of x

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        for (int i =1;i<=num;i++){
//            if(num%i==0){
//                System.out.print(i+" ");
//            }
//        }
       int factors_count = CountFactors(num);
        System.out.println("Factors Count: "+factors_count);

        /*..................................................*/
        System.out.println("Factors Count: " + CountFactorsTwo(num));
        /*.................................................*/

        Scanner sc1 = new Scanner(System.in);
        int test = sc1.nextInt();
        System.out.println(test);
        System.out.println("Sum of 1 to N " +test);

        //.....................Perfect Square............................
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter a number to check perfect square or not?");
        int x = sc2.nextInt();
        PerfectSquare(x);

    }
}
