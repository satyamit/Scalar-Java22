package Day13;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static  void playWithArray(){
        //1 Hard coded array
        int[] arr = {10,20,30,40,50};

        System.out.println(arr);
        System.out.println(arr.length);

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //loop
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        //for Each loop
        //it says for every element of the array , do some work

        int[] marks = {11,22,33,44,55};
        for(int i: marks){
            System.out.print(i+ " ");
        }

        //Arrays.toString();
        System.out.println();
        System.out.println(Arrays.toString(marks));

    }
    public static void main(String[] args) {
       // playWithArray();

        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] marks = new int[count];
        System.out.println(marks);
        System.out.println(Arrays.toString(marks));

        int[] test = new int[5];
        test[0] = 12;
        test[1] = 13;
        System.out.println(test);
        System.out.println(test.length);
        System.out.println(Arrays.toString(test));

        //array out of bound
       // test[6]= 123;
       // System.out.println();

        //Expand = create a new array
       test = new int[2*count];
       System.out.println(test);
        System.out.println(test.length);
        System.out.println(Arrays.toString(test));

        //.......................
        System.out.println("Enter count of array : ");
        int demo = sc.nextInt();
        int[] cards = new int[demo];
        for(int i = 0 ; i<cards.length;i++){
            cards[i]=sc.nextInt();
           // System.out.println(cards[i]);
        }
        for (int i = 0;i<cards.length;i++){
            System.out.print(cards[i]+" ");
        }
      for(int j : cards){
            System.out.print(cards[j]+ " ");
        }
    }
}
