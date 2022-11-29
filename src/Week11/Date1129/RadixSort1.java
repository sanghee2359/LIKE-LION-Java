package Week11.Date1129;

import java.util.*;

// 2. 출력받은 arr을 다시 10의 자리에서 정렬 (arr = [0, 1, 2, 13, 14, 16, 7, 7, 8, 18, 223])
// 3. 가장 높은 자릿수를 찾고 그만큼 자릿수 정렬을 반복해줘야한다.

//arr 각 수의 자릿수 [1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 3] —> 중복제거 [1, 2, 3]
public class RadixSort1 {
    public static int[] getDigits(int []arr){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            // 중복 제거하고 자릿수 구하기
            if(arr[i] == 0) set.add(1); // 자릿수 1 과 2
            else set.add((int)(Math.log10(arr[i])+1));
        }
        int[] answer = new int[set.size()];
        int idx = 0;
        for(Integer num : set){
            answer[idx++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14, 223};

        Queue<Integer>[] queueArr = new Queue[10];
        for (int i = 0; i < queueArr.length; i++) {
            queueArr[i] = new ArrayDeque<>(); // 덱
        }
        // 1의 자리로 분류
        for (int i = 0; i < arr.length; i++) {
            queueArr[arr[i] % 10].add(arr[i]);
        }
        // 꺼내서 arr에 다시 넣는다.
        int idx = 0;
        for (int i = 0; i < queueArr.length; i++) {
            while (!queueArr[i].isEmpty()) {
                arr[idx++] = queueArr[i].poll(); // 0번째부터 꺼내 arr에 넣는다.
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getDigits(arr)));

    }
}
