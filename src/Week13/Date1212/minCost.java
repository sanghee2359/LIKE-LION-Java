package Week13.Date1212;

import java.util.Arrays;

public class minCost {
    public static void main(String[] args) {
        int [] cost = {1, 3, 2};
        int [][] dp = new int[3][3];
        dp[0][0] = 1;
        dp[0][1] = dp[0][0]+cost[1];
        dp[0][2] = dp[0][1]+cost[2];
        System.out.println(dp[0][2]);
    }
}
