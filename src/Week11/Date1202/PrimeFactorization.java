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
        for (int i = 2; i*i <= N; i++) { // 2. a  * b일 때 최소 하나는 N 미만이다. 그 최소값중 가장 큰 i를 설정
            // 3. 해당 i를 N으롤 나머지 연산 했을 때 0이 나오면, N % i != 0 일때까지 반복한다.
            while (N % i == 0) {
                System.out.println(i);
                N = N / i;
            }
        }
        if (N != 1) // 4. 나머지가 1이 아니면 앞에서 나누고 남은 N을 출력한다.
            System.out.printf("%d\n", N);
    }
}

