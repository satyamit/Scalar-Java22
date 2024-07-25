package Day12;

import java.util.Scanner;

public class Assign02 {
    public static void main(String str[]){
        System.out.println("LCM ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int lcm=0;
        lcm = (num1>num1) ? num1 : num2;
        while (true){
            if(lcm % num1 == 0 && lcm % num2 == 0){
                System.out.println("LCM : "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
