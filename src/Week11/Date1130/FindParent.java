package Week11.Date1130;

public class FindParent {
    public static int count;
    public static int goUp(int a, int b) {
        // 올라간 만큼 1씩 올라가기 때문에 a == b가 되었을 때 출력되는 값이 두 노드간의 거리이다.
        // 부모가 같을때까지 부모를 찾으면서 한칸 올라갈때마다 +1
        // a = 3일 경우, 3의 부모는 1이다.
        if(a > b) {
            return goUp(a / 2, b) + 1; // a를 부모 쪽으로
        } else if(b > a) {
            return goUp(a,b/2) + 1; // b를 부모 쪽으로
        } else return 0;
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
//        int parentA = Math.floorDiv(a,2);

//        System.out.printf("parentA: %d", parentA);
        System.out.println(goUp(3,4));
    }
}
