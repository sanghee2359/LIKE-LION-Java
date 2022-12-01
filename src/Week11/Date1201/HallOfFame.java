package Week11.Date1201;

//점수 중 상위 k번째 이내이면 해당 가수의 점수를 명예의 전당이라는 목록에 올려 기념합니다.
// 프로그램 시작 이후 초기에 k일까지는 모든 출연 가수의 점수가 명예의 전당에 오르게 됩니다.
// 이 프로그램에서는 매일 "명예의 전당"의 최하위 점수를 발표합니다
// 명예의 전당 목록의 점수의 개수 k, 1일부터 마지막 날까지 출연한 가수들의 점수인 score가 주어졌을 때,
// 매일 발표된 명예의 전당의 최하위 점수를 return하는 solution 함수를 완성해주세요.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class HallOfFame {
    public int[] solution(int [] score, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < score.length; i++) {
            // k 사이즈보다 작으면 무조건 명예의 전당에 오르게 됨
            if(pq.size() < k){
                pq.add(score[i]);
                // k 이상이되면 지금까지 올라온 점수 중 최하위와 비교해서 k번 째 이내의 점수일 때  명예의 전당에 오름
            } else if(score[i]>pq.peek()) {
                pq.poll();
                pq.add(score[i]);
            }
//            System.out.println(pq.peek());
            list.add(pq.peek());
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        HallOfFame T = new HallOfFame();
        int[] score = new int[]{10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(T.solution(score, 3)));
    }
}
