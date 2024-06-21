package Functions;

import java.util.Scanner;

public class PrimePractice {
    public static boolean isPrime(int n){
        int count = 0;
        for(int i = 1 ;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return  true;
        }else
        { return  false;}
    }
    public static void printPrimes(int a, int b){
        for(int i = a ;i<=b;i++){
//            int count = 0;
//            for(int j = 1;j<=i;j++){
//                if(i%j==0){
//                    count++;
//                }
//            }
//            if(count == 2){
//                System.out.println(i);
//            }
           if( primePractice2(i)){
               System.out.println(i);
           }
        }
    }

    public static boolean primePractice2(int n){
        for(int i =1;i<=n-1;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
           System.out.println("Prime");
        }else{
           System.out.println("Not Prime");
       }
        printPrimes(2,100);

       if (primePractice2(9)){
           System.out.println("9 is prime");
       }else{
           System.out.println("9 is not prime");
       };
    }
}
