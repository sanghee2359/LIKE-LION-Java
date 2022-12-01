package Week11.Date1201;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HallOfFrame2 {
    public int[] solution(int k, int[] score) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < score.length; i++) {
            if(list.size() < k) {
                list.add(score[i]);
            }else {
                Collections.sort(list);
                //최소값
                if(list.get(0) < score[i]) {
                    list.remove(0);
                    // 다시 넣고
                    list.add(score[i]);
                    //정렬해서
                    Collections.sort(list);
                }
            }
            System.out.println(list.get(0));
        }
        return answer;
    }

    public static void main(String[] args) {
        HallOfFrame2 T = new HallOfFrame2();
        int[] score = new int[]{10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(T.solution(3, score)));
    }
}
