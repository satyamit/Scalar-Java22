package Functions;

import java.util.Scanner;

public class FunctionBasics {
    public static int calArea(int len, int brd){
        int area = len*brd;
        return  area;

    }
    public static void main(String[] args) {
        System.out.println("FunctionBasics");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(calArea(l,b));
    }
}
