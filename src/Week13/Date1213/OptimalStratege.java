package Week13.Date1213;

// 하나의 칸에 두개 이상의 값을 넣을 때 내부클래스 만들어 사용하면 편하다
class Pair1{
    @Override
    public String toString() { // Pair의 값을 print해볼 수 있다.
        return "Pair1{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    public Pair1(int left, int right) {
        this.left = left;
        this.right = right;
    }

    int left;
    int right;
}

public class OptimalStratege {
    public static void main(String[] args) {
        int[] list = {2, 7, 40, 19};
        Pair1[][] dp = new Pair1[list.length][list.length];

        for (int i = 0; i < list.length; i++) {
            //0,0, 1,1, 2,2, 3,3
            dp[i][i] = new Pair1(list[i], 0);
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(dp[i][i].toString());
        }
    }
}
