package Week11.Date1130;
//'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return
public class CountPAndY {
    public static boolean count(String s) {
        String str = s.toUpperCase();
        int countP = 0;
        int countY = 0;
        for(char x : str.toCharArray()) {
            if(x == 'P') countP++;
            if(x == 'Y') countY++;
        }
        if(countP != countY) return false;
        else return true;
    }
    public static void main(String[] args) {
        String s = "pPoooyY";
        System.out.println(count(s));
    }
}
