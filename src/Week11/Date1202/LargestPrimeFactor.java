package Week11.Date1202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LargestPrimeFactor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        Set<Long> primeFactor = new HashSet<>();

        for (long i = 2; i*i <= N; i++) {
            while (N % i == 0) {
                primeFactor.add(i);
                N = N / i;
            }
        }
        if (N != 1)
            primeFactor.add(N);
//        System.out.println(primeFactor);
        System.out.println(Collections.max(primeFactor));
    }
}
