package Day24;

public class SubArrays {
    public static void SubArray3(int[] demoArr,int start,int end){
        for(int i = start;i<=end;i++){

            System.out.print(demoArr[i]+" ");
        }
    }

    public static void SubArray4(int[] demoArr){
        int n = demoArr.length;
        System.out.println(n);
        int Total_No_Subarray = (n*(n+1))/2;
        System.out.println(Total_No_Subarray);
    }
    public static void SubArray5(int[] demoArr){
        for(int start = 0;start<demoArr.length;start++){
            for(int end = start;end<demoArr.length;end++){
                for(int result = start; result<=end;result++){
                    System.out.print("["+start+end+"]"+demoArr[result]+" ");
                }
                System.out.println();
            }
        }
    }

    public static void SubArray6(int[] demoArr){
        for(int start = 0;start<demoArr.length;start++){
            for(int end = start;end<demoArr.length;end++){
                int sum = 0;
                for(int result = start; result<=end;result++){
                    System.out.print("["+start+end+"]"+demoArr[result]+" ");
                    sum = sum + demoArr[result];

                }
                System.out.print("sum: "+sum);
                System.out.println();
            }

        }
    }
    public static void SubArray7(int[] demoArr){
        int sum = 0;
        for(int i = 2;i<demoArr.length;i++){
            sum = sum + demoArr[i];
            System.out.print(sum+" ");
        }
        System.out.println("..........");
    }
    public static void SubArray8(int[] demoArr){

        for(int i =0;i<demoArr.length;i++){
            int sum = 0;
            for(int j = i;j<demoArr.length;j++){
                sum = sum + demoArr[j];
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void SubArray9(int[] demoArr){
        int max = 0;
        for(int start = 0;start<demoArr.length;start++){
            for(int end = start;end<demoArr.length;end++){
                int sum = 0;
                for(int result = start; result<=end;result++){
                    System.out.print("["+start+end+"]"+demoArr[result]+" ");
                    sum = sum + demoArr[result];
                    if(sum>max){
                        max = sum;
                    }
                }
                System.out.print("sum: "+sum);
                System.out.println();
            }
        }
        System.out.println("Max Sum of Subarray: "+max);
    }
    public static void main(String[] args) {
        /*
         * Problem Statement - 4
         * Given a start and end index. Print the subarray between start and end for given subarray arr
         * */
        int[] demoArr6 = {1,2,5,6,-1};
        int start = 2 , end = 4;
        // SubArray3(demoArr6,start,end);

        /*
         * Problem Statement - 5
         * Find number of subarray for given array?
         * */
        //int[] demoArr7 = {3,4,5,-1};
        int[] demoArr7 = {5,4,1,0,-1};
        //SubArray4(demoArr7);

        /*
         * Problem Statement - 6
         * Print all the subarray of a given array?
         *
         * */
        int[] demoArr8 = {3,8,1};
        //SubArray5(demoArr8);

        /*
        * Poblem Statement - 7
        * Print sum of all the Subarrays?
        * */
        int[] demoArr9 = {3,8,1};
        //SubArray6(demoArr9);

        /*
        *Problem Statement - 8
        * What is the sum if all Subarrays starting with index 2 individually
        * */
        int[] demoArr10 = {4,-1,1,6,5,4,3,2};
       // SubArray7(demoArr10);

        /*
            Pronlem Statement - 9
            What is the sum of all subarrays of all indices individually
        **/
        int[] demoArr11 = {4,-1,1,6,5,4,3,2};
       // SubArray8(demoArr11);

        /*
        * Problem Statement - 10
        * Find max sum Subarray?
        * */
        int[] demoArr12 = {3,4,5,-1};
        SubArray9(demoArr12);

        
    }
}
