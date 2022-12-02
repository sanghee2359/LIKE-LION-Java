package Week11.Date1202;
// 소인수 구하기

import java.util.Scanner;

//1. n을 소인수분해 한 결과를 한 줄에 출력한다.
//2. 소수들을 크기가 작은 수부터 큰 수의 순으로 출력한다.
//3. 각 소수들은 하나의 공백으로 분리한다.
//4. 곱하기 기호는 출력하지 아니한다.
public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //1. 2부터 for문으로 나눈다.
        for (int i = 2; i*i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }
        if (N != 1)
            System.out.printf("%d\n", N);
    }
}

