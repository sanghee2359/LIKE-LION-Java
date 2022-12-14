package Week13.Date1213;

import java.util.Arrays;

public class SumUntil {

    public static void main(String[] args) {
        int[] list = {2,7,40,19};
        int[][] dp = new int[list.length][list.length];

        for (int i = 0; i < list.length; i++) {
            for (int j = i; j < list.length; j++) {
                if(j == 0) dp[i][j] = list[j];
                else dp[i][j] = dp[i][j-1]+list[j];
            }
            Arrays.stream(list).min();
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}
