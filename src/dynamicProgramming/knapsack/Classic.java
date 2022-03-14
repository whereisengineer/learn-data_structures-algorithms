package dynamicProgramming.knapsack;
//recursive solution of knapsack problem
public class Classic {

    public static void main(String[] args) {
        int[] val = new int[]{60,100,120};
        int[] wt = new int[]{10,20,30};
        int w = 50;
        int n = val.length;
        System.out.println(knapSack(val, wt, w, n));
    }

    public static int knapSack(int[] val, int[] wt, int w, int n){
        if(n == 0 || w==0){
            return 0;
        }

        if(wt[n-1] <= w){
            return Math.max(val[n-1]+knapSack(val, wt, w-wt[n-1], n-1), knapSack(val,wt,w,n-1));
        }
        else{
            return knapSack(val, wt, w, n-1);
        }
    }
}
