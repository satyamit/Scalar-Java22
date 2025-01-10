package Day25;

public class TwoDMatrices {
    public static void SumOfRows(int[][] arr,int nRows,int nCols){
        for(int i =0;i<nRows;i++){
            int sum = 0;
            for(int j =0;j<nCols;j++){
                sum += arr[i][j];
            }
            System.out.println("sum of " +i+"th rows: " +sum);
        }
    }
    public static void SumOfCols(int[][] arr,int nRows,int nCols){
        for(int i=0;i<nCols;i++){
            int sum=0;
            for(int j =0;j<nRows;j++){
                sum+=arr[j][i];
            }
            System.out.println("sum of "+i+"th columns: "+sum);
        }
    }
    public static void PrintDiagonals(int[][] arr){
        int i =0;
        while(i<arr.length){
            System.out.print(arr[i][i]+" ");
            i++;
        }
        System.out.println();
        int m = 0, n = arr.length-1;
        while(m<arr.length && n>=0){
            System.out.print(arr[m][n]+" ");
            m++;
            n--;
        }
    }
    public static void RectangleMatrixDiagonals(int[][] arr){
        int nCols = arr[0].length;
        int i=0,j=0;
        int k=0;
        for( k =0;k<nCols;k++){
            i=0;j=k;
            while(i<arr.length&&j>=0){
                System.out.print(arr[i][j]+" ");
                i++;j--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nRows,nCols;
        int[][] arr=    {
                            {1,-1,4,3},
                            {2,6,-1,-2},
                            {6,-1,0,3}
                        };
        nRows = arr.length;
        nCols = arr[0].length;

        SumOfRows(arr,nRows,nCols);
        System.out.println("..........");
        SumOfCols(arr,nRows,nCols);

        //............................
        /*Need to print the diagonal elements
        *
        * */
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Print Diagonal Elements:");
        PrintDiagonals(arr1);

        System.out.println("\n"+"...................");
        //...............................
        /*
        * Given a rectangle matrix, print all diagonals from Right to Left
        * and top to bottom
        * */
        int[][] arr2 ={{1,2,3,4,5},{-1,6,7,11,12},{13,-3,4,6,15},{21,13,0,7,8}};
        System.out.println("Given a rectangle matrix, print all diagonals from Right to Left and top to bottom");
        RectangleMatrixDiagonals(arr2);
    }
}
