package Week11.Date1201;
// 1번부터 number까지 번호가 지정되어 있습니다. 기사들은 무기점에서 무기를 구매하려고 합니다.
// 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다
// 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 이므로,
// 공격력이 4인 무기를 구매합니다.
// 제한수치가 3이고 제한수치를 초과한 기사가 사용할 무기의 공격력이 2라면, 4
// 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다.


public class knightSWeapon {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int [] array = new int[number+1]; // 약수의 개수를 담을 배열 생성

        array[1] = 1;
        for (int j = 2; j <= number ; j++) {
            int count = 0;
            for (int i = 1; i <= Math.sqrt(j); i++) {	// 또는 i * i <= N
                if(i * i == j) count++;
                else if( j % i == 0) count += 2;
            }
            if(count > limit) count = power; // limit 조건
            array[j] = count;
//            System.out.printf("%d번째의 약수의 개수:%d\n",j,array[j]);
        }
        for(int x : array) answer += x; // array의 약수의 개수를 모두 더한다.
        return answer;
    }

    public static void main(String[] args) {
        int N = 10;
        int limit = 3;
        int power = 2;
        System.out.println(solution(N, limit, power));
    }
}
