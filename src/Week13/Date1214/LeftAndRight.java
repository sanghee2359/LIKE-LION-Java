package Week13.Date1214;

public class LeftAndRight {
    // 최적의 값 출력하기
    public static void main(String[] args) {
        int[] list = {2,7,40,19};
        Pair[][] dp = new Pair[list.length][list.length];

        // i,j -> 인덱스
        // 0,1
        // 1,2
        // 2,3
        // 왼쪽(나)와 오른쪽(상대)를 정하는 로직

        for (int i = 1; i < list.length ; i++) {
            for (int j = 0; j < list.length - i; j++) {
                int coinLeft = list[j];
                int coinRight = list[j + i];
                dp[i][j] = new Pair(coinLeft, coinRight);
                System.out.printf("%d %d\n", coinLeft, coinRight);
            }
        }
    }
}
class Pair {
    private int left;

    public Pair(int left, int right) {
        this.left = left;
        this.right = right;
    }

    private int right;
}