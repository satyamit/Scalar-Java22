package Day14;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void firstDemo(){
        //creates the array
        int[][] arr = new int[3][4];

        //Print the data
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        // System.out.println(arr);
        int rows = arr.length;
        int cols = arr[0].length;
        int cols1 = arr[1].length;
        System.out.println(rows+" "+cols+" "+cols1);

        //print all the elements of the array
        for(int i =0;i<rows;i++){
            //prints i th row array
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0;i<rows;i++){
            //print the iit row
            //go to every element of the iths row
            for(int j = 0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

    }
    public static void secondDemo(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] data = new int[r][c];
        int row = data.length;
        int col = data[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                data[i][j]=7;
            }
        }
        for(int i = 0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        }
        public static void thirdDemo(){
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            int c = sc.nextInt();

            int[][] bag = new int[r][c];

            int row = bag.length;
            int col = bag[0].length;

            for(int i=0;i<row;i++){
                for (int j=0;j<col;j++){
                    bag[i][j]=sc.nextInt();
                }
            }
            for(int i=0;i<row;i++){
                for(int j =0;j<col;j++){
                    System.out.print(bag[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void forthDemo(int[][] arr){
            for(int i=0;i<arr.length;i++){
                int cols = arr[i].length;
                for(int j = 0;j<cols;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        public static void fifthDemo(int[][] arr){
            for(int i=0;i<arr.length;i++){
                int cols = arr[i].length;
                System.out.println(Arrays.toString(arr[i]));
            }
        }
        public static  void sixthDemo(){
            int row = 5;
            int[][] arr = new int[row][];
            System.out.println(arr);
            System.out.println(Arrays.toString(arr));

            Scanner sc = new Scanner(System.in);
            for(int i=0;i<row;i++){
                System.out.println("Cols in "+i+" rows ");
                int cols = sc.nextInt();
                //first create array for ith row
                arr[i]=new int[cols];
                //once array is created, read it
                //read ith row
                for(int j=0;j<cols;j++){
                    arr[i][j]=sc.nextInt();
                }
                System.out.println(Arrays.toString(arr[i]));
            }
        }
        public static void seventhDemo(int[][] arr,int num){
           for(int i =0;i<arr.length;i++){
               for(int j=0;j<arr[i].length;j++){
                   if(num==arr[i][j]){
                       System.out.println(i+" "+j);
                   }
               }
           }
        }
    public static void main(String[] args) {
      // firstDemo();
        //inputs from user
           // secondDemo();
      // thirdDemo();

       //2D Array with harcoded values
        int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};
        int[][] arrTest = {{10},{11,22,33,44},{111,222}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        System.out.println(arrTest.length);
        System.out.println(arrTest[0].length);
        System.out.println(arrTest[1].length);

       // forthDemo(arrTest);
       // fifthDemo(arrTest);
       // sixthDemo();
        seventhDemo(arr,90);
       }
    }

//java support pass by value only

/*
* Default value
* int - 0
* boolean - false
* obj reference - null
*
* */

