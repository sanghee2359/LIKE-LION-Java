package Week12.Date1208;

public class FiboDp {
    public static int fibRecur(int n) {
        if (n <= 1) return n;
        else return fibRecur(n-1) + fibRecur(n-2);
    }
    public static int fibDp(int n, int[] memo) {
        if(n <= 1) return n;
        if(memo[n] == 0) {
            memo[n] = fibDp(n-1, memo)+ fibDp(n-2, memo);
        }
        return memo[n];
    }

    public static void main(String[] args) {
//        var r = fibDp(60, new int[60+1]);
//        System.out.println(r);
        System.out.println(fibRecur(45));
    }
}
