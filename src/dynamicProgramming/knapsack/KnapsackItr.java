package dynamicProgramming.knapsack;

//Solve a knapsack problem with Iteration with Tabulation approcah

public class KnapsackItr {

    public static void main(String[] args) {

        int[] val = new int[]{60,100,120};
        int[] wt = new int[]{10,20,30};
        int W = 50;
        int n = val.length;

        int[][] table = new int[n+1][W+1];

        for(int i =0; i<n+1; i++){
            for(int j=0 ; j< W+1; j++){
                if(i ==0 || j==0){
                    table[i][j] =0;
                    continue;
                }

                if(wt[i-1] <= j){
                    int s1 = val[i-1] + table[i-1][j-wt[i-1]];
                    int s2 = table[i-1][j];
                    table[i][j] = s1 >s2 ? s1: s2;
                }
                else {
                    table[i][j] = table[i-1][j];
                }
            }
        }

        System.out.println(table[n][W]);



    }
}
