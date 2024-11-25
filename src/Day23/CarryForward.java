package Day23;

public class CarryForward {
    public static void FindCount1(char[] demoArr, int count){
        for(int i = 0;i<demoArr.length;i++){
            System.out.print(demoArr[i]+" ");
        }
        System.out.println();
        for(int i = 0;i<demoArr.length;i++){
            if(demoArr[i]=='a'){
                for(int j =i+1;j<demoArr.length;j++){
                    if(demoArr[j]=='g'){
                        System.out.println("< "+i+","+j+" >");
                        count++;
                    }
                }
            }
        }
        System.out.println(count+" pairs");
    }
    public static void FindCount2(char[] demoArr){
        int countg = 0;
        int count=0;
        for(int i = demoArr.length-1; i>=0;i--){
            if(demoArr[i]=='g') {
                countg++;
            }else if(demoArr[i]=='a'){
                count = count + countg;
            }
        }
        System.out.println(count + " pairs...");
    }
    public static void FindCount3(int[] demoArr){
        int count=0;

        int check=0;
        for(int i = 0;i<demoArr.length;i++){
            //int check = 0;
           // int checkj=0;//{5,11,4,1,-1,0
            int out=0;
            System.out.println("i: "+i);
            for(int j = i+1;j<demoArr.length;j++){
                System.out.println("j: "+j);
                System.out.println("demoArr["+i+"] "+demoArr[i]);
                System.out.println("demoArr["+j+"] "+demoArr[j]);
               if (demoArr[i]>demoArr[j]){
                   //check++;
                  // checkj=j;
                  // System.out.println("checkj"+checkj);
                  // System.out.println("check: "+check);
                   count++;
                   System.out.println("inside count: "+count);
               }else{
                   out++;
                   System.out.println("break");
                   break;
               }
            }//{5,11,4,1,-1,0
//            if(check==checkj-1){
//                count++;
//                System.out.println("inside count: "+count);
//            }
                if(out==0){
                    check++;
                }
        }
        System.out.println("Total Check: "+check);
    }
    public static void LeadersOfAnArray(int[] demoArr){
        int maxValue = 0;
        int count=0;
        for(int i=demoArr.length-1;i>=0;i--){
            if(demoArr[i]>maxValue){
                maxValue=demoArr[i];
                count++;
            }
        }
        System.out.println("Leaders Of An Array: "+count);
    }
    public static int FindOutMin(int a,int b){
       int MIN;
        if(a<b){
            MIN = a;
        }else {
            MIN = b;
        }
        return MIN;
    }
    public static void SubArray1(int[] demoArr){
        int MAX = 0;
        int MIN = demoArr[0];
        for(int i = 0;i<demoArr.length;i++){
            if(demoArr[i]>MAX){
                MAX=demoArr[i];
            }
            if(demoArr[i]<MIN){
                MIN = demoArr[i];
            }
        }
        System.out.println("MAX: "+MAX+ " MIN: "+MIN);

        int result = demoArr.length;
        for(int i = 0;i<demoArr.length;i++){
            if(demoArr[i]==MAX){
                int length = 0;
                for(int j = i+1;j<demoArr.length;j++){
                    if(demoArr[j]==MIN){
                        length = j - i + 1;
                        result = FindOutMin(result,length);
                    }
                }
            }
            if(demoArr[i]==MIN){
                int length = 0;
                for(int j = i+1;j<demoArr.length;j++){
                    if(demoArr[j]==MAX){
                        length = j - i + 1;
                        result = FindOutMin(result,length);
                    }
                }
            }
        }
        System.out.println("Result: "+result);
    }
    public static void SubArray2(int[] demoArr){
        int MAX = 0;
        int MIN = demoArr[0];
        for(int i = 0;i<demoArr.length;i++){
            if(demoArr[i]>MAX){
                MAX=demoArr[i];
            }
            if(demoArr[i]<MIN){
                MIN = demoArr[i];
            }
        }
        System.out.println("MAX: "+MAX+ " MIN: "+MIN);

        int length =0;
        int MAXi = -1;
        int MINi = -1;
        for(int i = demoArr.length-1;i>=0;i--){
            if(demoArr[i]==MAX){
                MAXi = i;
                length = MAXi - MINi + 1;
            }else if(demoArr[i]==MIN){
                MINi = i;
                length = MINi - MAXi + 1;
            }else{

            }
        }
        System.out.println("length: "+length);
    }
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

    public static void main(String[] args) {

        System.out.println("Carry Forward...");
//      Problem Statement - 1
//      Count Number of pairs i,j such that i<j and s[i] = 'a' and s[j] = 'g'
//      where s is a character array

        int count=0;
        char[] demoArr1 = {'b','a','a','g','x','d','c','a','g'};
       // FindCount1(demoArr1,count);
       // FindCount2(demoArr1);

//       Problem Statement - 2
//       Leaders of an Array
//       Given an array, find leaders, leader is defined as if all element is greater than all the elements on the
//       right of it
         int[] demoArr2 = {5,11,4,1,-1,0};
       // FindCount3(demoArr2);

        int [] demoArr3 = {5,7,6,1,-1,0,5,2};
       // LeadersOfAnArray(demoArr3);

        /**
         * Problem Statement - 3
         * SubArray
         * Closest Min Max
         * Given an array find the length of smallest subarray which contain both min and max of array
         *
         */
        System.out.println("Subarray....");
       // int[] demoArr4 = {1,2,3,1,3,4,6,4,6,3};
        int[] demoArr4 = {2,2,6,4,5,1,5,2,6,4,1};
       // SubArray1(demoArr4);

        int[] demoArr5 = {1,6,4,6,5,1,2,6,4,4,2,1};
       // SubArray2(demoArr5);

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
        SubArray5(demoArr8);


    }
}
