package Week11.Date1129;

import java.util.Arrays;

// 배열 10개를 만들고
// 7,4,5,9,1,0 를 배열의 인덱스에 맞게 넣고
// 앞에서부터 꺼내서 정렬하는 코드를 만들어 보세요.


//가장 큰 숫자는 1000000000(0이 9개)입니다. 그러면 가장 큰 숫자만큼 배열을 생성하면 문제가 없을까요?
// : 정렬해야 할 숫자가 10개 밖에 없다면 혹은 1만개 2만개라면 어떨까요? 공간이 많이 낭비  됩니다.
// 1. 일의 자리수로 정렬
// 2. 십의 자리수로 정렬
// 3. 가장 높은 자릿수를 찾고 그만큼 자릿수 정렬을 반복해줘야한다.
public class RadixSort1 {
    public static void main(String[] args) {
        int[] arr = new int []{7,4,5,9,1,0};
        int[] redix = new int [10];
        Arrays.fill(redix, -1);
        /* 이 방법도 사용 가능
        for(var i : arr) {
            redix[i] = i;
        }*/
        for (int i = 0; i < arr.length; i++) {
            redix[arr[i]] = arr[i];
        }
        for(int x : redix) {
            if(x != -1) System.out.println(x);
        }
    }
}
