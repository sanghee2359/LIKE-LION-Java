package Week13.Date1212;

import java.util.Arrays;

public class MinCost {
    public static void getMinCost(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(i==0&&j==0) dp[i][j] = matrix[i][j]; // 한칸 집어넣기
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

    }
    public static void main(String[] args) {
        int[][] cost = {
                {1, 3, 2},
                {4, 6, 2},
                {1, 2, 4}};
        getMinCost(cost);
        /*int [][] dp = new int[3][3];
        dp[0][0] = 1;
        dp[0][1] = dp[0][0]+cost[0][1];
        dp[0][2] = dp[0][1]+cost[0][2];
        System.out.println(dp[0][2]);

        dp[1][0] = dp[0][0] + cost[1][0];
        dp[1][1] = getMinCost();*/
    }
}
