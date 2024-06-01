import java.util.Arrays;

public class knapsackDP {


    // memoization

    public static int knapSackMemo(int m, int pr[], int wt[], int n, int dp[][]) {
        if (m == 0 || n == 0)
            return 0;

        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        
        if (wt[n - 1] > m)
            return dp[n][m] = knapSackMemo(m, pr, wt, n - 1, dp); // exclude it
        else {
            return dp[n][m] = Math.max(knapSackMemo(m, pr, wt, n - 1, dp), pr[n-1]+knapSackMemo(m - wt[n - 1], pr, wt, n - 1, dp));
        }
    }

    public static int helper(int m, int pr[], int wt[], int n){
        int dp[][] = new int[n+1][m+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                dp[i][j] =-1;
            }
        }
        return knapSackMemo(m, pr, wt, n, dp);

    }



    // tabulation
      // function definition of knapSackTabu method
    // tabulation approach in dp - No recursion
    // time complexity: O(n * m)
    // space complexity: O(n * m)
    public static int knapSackTabu(int m, int[] profit, int[] weight, int n){
        int[][] dp = new int[n+1][m+1];

        for(int i=0; i<=n; i++){
            for(int w=0; w<=m; w++){
                if(i == 0 || w == 0){
                    dp[i][w] = 0;
                }

                else if(weight[i-1] <= w){
                    dp[i][w] = Math.max(dp[i-1][w], profit[i-1] + dp[i-1][w - weight[i-1]]);
                }
                else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][m];
    }

    public static void main(String[] args) {
        int pr[] = { 60, 120, 100 };
        int wt[] = { 10, 20, 30 };
        int m = 50;
        int n = pr.length;
        // System.out.println(helper(m, pr, wt, n));
        System.out.println(knapSackTabu(m, pr, wt, n));

    }
}
