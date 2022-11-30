package Week11.Date1130;

import java.util.ArrayList;
import java.util.List;

//입출력 예 #1
  //      12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
public class SumOfFactor2 {
    public static int sum(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (Math.floorMod(n, i) == 0) { // floorMod() : 나눗셈(나머지)
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(sum(n));
    }
}
