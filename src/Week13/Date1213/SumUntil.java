package Week13.Date1213;

import java.util.Arrays;

public class SumUntil {

    public static void main(String[] args) {
        int[] list = {2,7,40,19};
        int[][] dp = new int[list.length][list.length];
        int i = 0;
//        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if(j == 0) dp[i][j] = list[j];
                dp[i][j] += dp[i][j-1]+list[j];
            }
            System.out.println(Arrays.toString(dp[i]));
//        }
    }
}