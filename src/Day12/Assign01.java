package Day12;

import java.util.Scanner;

public class Assign01 {
    public static void main(String str[]){
        System.out.println("Now in Assign 01");
        //HCF using loop
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num1_;
        int num2_;
        while(num1>0){
            num1_=num2%num1;
            num2_=num1;
            //update
            num1=num1_;
            num2=num2_;
        }
        System.out.println("HCF : "+num2);
    }
}
