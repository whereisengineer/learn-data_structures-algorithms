package dynamicProgramming.knapsack;

import java.util.Arrays;

//recursive memoized code of knapsack 0/1 problem
public class Classic2 {

    public static void main(String[] args) {
        int[] val = new int[]{60,100,120};
        int[] wt = new int[]{1,1,1};
        int w = 2;
        int n = val.length;

        int[][] memoization = new int[n+1][w+1];
        for(int[] arr1: memoization)
            Arrays.fill(arr1, -1);

        System.out.println(knapSack(val, wt, w, n, memoization));

    }

    public static int knapSack(int[] val, int[] wt, int w, int n, int[][] memoization){

        if(n == 0 || w == 0){
            return 0;
        }

        if(memoization[n][w] != -1){
            return memoization[n][w];
        }

        if(wt[n-1] <= w){
             memoization[n][w] = Math.max(
                    val[n-1] + knapSack(val, wt, w-wt[n-1], n-1, memoization),
                    knapSack(val,wt, w, n-1, memoization)
            );

            return memoization[n][w];
        }
        else{
            memoization[n][w] = knapSack(val, wt, w, n-1, memoization);
            return memoization[n][w];
        }
    }
}
