package Week11.Date1130;

public class FindParent {
    public static int count;
    public static int goUp(int a, int b) {
        if(a>b) {
            return goUp(a / 2, b)+1; // a를 부모 쪽으로
//            count++;
        } else if(b>a) {
            return goUp(a,b/2)+1; // b를 부모 쪽으로
//            count++;
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
