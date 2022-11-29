package Week11.Date1129;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

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
        int[] arr = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14};
//        int[] redix = new int [10];
        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>(); // 덱
        }
        /* 이 방법도 사용 가능
        for(var i : arr) {
            queueArr[i % 10].add(i); // i % 10해서 일의 자리를 구함
        }*/
        for (int i = 0; i < arr.length; i++) {
            queueArr[arr[i]%10].add(arr[i]);
        }
        // 꺼내서 arr에 다시 넣는다.
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while(!queueArr[i].isEmpty()){
                arr[idx++] = queueArr[i].poll(); // 0번째부터 꺼내 arr에 넣는다.
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
