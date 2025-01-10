package Day26;

public class InterviewQuestions {
    public static void LeftRightEnd(){
        int[] arr = {5,-2,3,1,2};
        int B=3;
        int sum=0, maxSum =0;
        int P1=B-1, P2=arr.length-1;
        for(int i=0;i<B;i++){
            sum = sum + arr[i];
        }
        maxSum=sum;
        while(P1>=0){
            sum = sum + arr[P2]+arr[P1];
            maxSum=countMax(maxSum,sum);
            P1--;
            P2--;
        }
        System.out.println(maxSum+": maxSum");
    }
    public static int countMax(int first,int second){
        int max;
        if(first>second){
            max=first;
        }else {
            max=second;
        }
        return max;
    }
    public static int countMin(int first,int second){
        int min;
        if(first>second){
            min=second;
        }else{
            min=first;
        }
        return min;
    }

    public static void  RowColumnZero(){
        int[][] arr = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,1,1,1}};
        //part:01
        for(int i =0;i<arr.length;i++){
            for (int j =0;j<arr.length;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        //part:02
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public  static  void  BulbOnOff(){
        int[] arr = {1,0,1,0};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
            for(int j =i;j<arr.length;j++){
                if(arr[i]==0){
                    arr[i]=1;
                }else{
                    arr[i]=1;
                }
            }
        }
        System.out.println("No of Switches Required: "+count);
        System.out.println();
    }
    public static void MatrixMultiplication(){
        int[][] arr1 = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] arr2 = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] arr3=new int[3][4];
        for(int i=0;i<arr1.length;i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j] = 0;
                for (int k = 0; k < arr2.length; k++) {
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
                System.out.print(arr3[i][j] + " ");
            }
        }
    }
    public static void ChristmasTree(){
       // int[] height={11,12,13,14};
       // int[] cost={5,6,1,4};
        int[] height={1,6,4,2,6,9};
        int[] cost={2,5,7,3,2,7};

        int totalCost=0;
        int minCost = Integer.MAX_VALUE;

        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<cost.length;j++){
                for(int k=j+1;k<cost.length;k++){
                    if(height[i]<height[j] && height[j]<height[k]){
                        totalCost=cost[i]+cost[j]+cost[k];
                        minCost=countMin(totalCost,minCost);
                    }
                }
            }
        }
        System.out.println("minimum Cost: "+minCost);
    }
    public static void ChristmasTreePart2(){
        int[] height={1,6,4,2,6,9};
        int[] cost={2,5,7,3,2,7};
        int costForJ=0;
        int minCost=Integer.MAX_VALUE;
        for(int j =1;j<height.length-2;j++){
            //check of left
            int minLeft=Integer.MAX_VALUE;
            for(int i=j-1;i>=0;i--){
                if(height[i]<height[j]){
                    minLeft=countMin(minLeft,cost[i]);
                }
            }
            //check for right
            int minRight=Integer.MAX_VALUE;
            for(int k=j+1;k<height.length;k++){
                if(height[j]<height[k]){
                    minRight=countMin(minRight,cost[k]);
                }
            }
            //sum of cost for j
            costForJ = minLeft + minRight + cost[j];
            minCost = countMin(minCost,costForJ);
        }
        System.out.println("minimum Cost using another method:" + minCost);
    }
    public static void GoogleTriplets(){
       // int[] arr={1,2,3,4};
        int[] arr ={1,6,4,2,6,9};
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]<arr[j] && arr[j]<arr[k]){
                        count++;
                    }
                }
            }
        }
        System.out.println("Total Triplets: "+count);
    }
    public static void GoogleTripletsPart2(){
        //int[] arr = {1,2,3,4};
       int[] arr ={1,6,4,2,6,9};
        int count=0;
        int minLeft=0,minRight=0;
        for(int j=1;j<=arr.length-2;j++){
             minLeft=0;
            for(int i=j-1;i>=0;i--){
               if(arr[i]<arr[j]){
                  System.out.println(i+","+j);
                  minLeft++;
               }
            }
            minRight=0;
            for(int k=j+1;k<arr.length;k++){
                if(arr[j]<arr[k]){
                    System.out.println(j+" "+k);
                    minRight++;
                }
            }
//            if(minLeft==minRight){
//                count++;
//            }
                count = count+(minLeft*minRight);
        }
        System.out.println("Total Triplet with another method: "+count);
    }
    public static void SpiralMatrix(){
        int[][] arr= {{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        int left=0,right=arr.length-1,top=0,bottom=arr.length-1;
        int step=1;
        while(left<=right && top<=bottom){
            if((step%4) == 1){
                //iterate Left to Right
                for(int i = left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            if((step%4) == 2){
                //iterate Top to Bottom
                for(int i=top;i<=bottom;i++){
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            if((step%4) == 3){
                //iterate from Right to Left
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
            }
            if((step%4) == 0){
                //iterate from bottom to top
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            step++;
        }
    }
    public static void main(String[] args) {
//        int[] arr = {2,-3,5,6,-1,4,-2,0,4};
//        int k=3;
//        int max = 0;
//        for(int d=0;d<arr.length;d++){
//            int sum =0;k=3+d;
//            for(int i =d;i<k;i++){
//                sum = sum + arr[i];
//                if(max<sum){
//                    max = sum;
//                }
//            }
//            System.out.println(sum);
//        }
//        System.out.println(max);

        /*14 Apr | Intermediate DSA: Problem Solving Session - 1
        Q1.
        Given an integer array A of size N.
        You can pick B elements from either left or right end of the array A to get maximunm sum.
        Find and return tis maximum possible sum.
        Note: Suppose B=4 and array A contains 10 elements then
        you can pick first four elements or can pick last four elements or can
        pick 1 from front and 3 from back etc.
        You need to return the maximum possible sum of elements you can pick
        * */
       // LeftRightEnd();

        /*
        * Q2. You are given a 2D integer matrix A, make all the elements in a row or column zero,
        *  if the A[i][j]=0 specifically make entire ith row and jth columns zero
        * */
       // RowColumnZero();

        /*
        * Q3. Multiplication of matrices
        * You are given two integer matrices A(having M*N size) and B(having N*P size). You have to
        * multiply matrix A with B and return the resultant matrix (i.e. return the matrix AB)
        *
        * */
       // MatrixMultiplication();
        /*
        * Q4. bulb problem
        *
        * /

         */
       // BulbOnOff();


        /*
        * 16APR | Intermediate DSA: Problem Solving Session - 2
        *Q1) Christmas Question Tree
        * */
       // ChristmasTree();
        //from above ChristmasTree(), the TC: O(n^3)
        //we are going for another solution
       // ChristmasTreePart2();

        /*
        * Q2) Google Problem
        * Given an array, find the number of triplets i,j,k such that A[i]<A[j]<A[k]
        * */
        GoogleTriplets();
        //from above GoogleTriplets(), the TC: O(n^3)
        //we are going for another solution
        GoogleTripletsPart2();

        /*
        * Q3) Traverse a N*N matrix spirally value = 5
        * */
        SpiralMatrix();
    }
}

// we can store the indices of zero, its [1,1] and [2,2]
//then  iterate the matrix then make the first row zero, second row zero, first column zero, second column zero
//