package Week11.Date1128;

public class recurComination2 {
    public static void printAlphabet(String prefix, int n) {
        // 문자 c가 z 이상이면, c는 'A'로 prifix는 다음 알파벳으로 변경
        // 칸의 개수를 밖에서 지정하도록 변경
        if (prefix.length() >= n){
            System.out.println(prefix);
            return;
        }
        //prefix = String.valueOf((char)(prefix.charAt(0)+1));
        for (char c = 'A'; c <= 'Z'; c++) {
            printAlphabet(prefix + c, n);
        }
    }
    public static void main(String[] args) {
        printAlphabet("", 2);
    }
}
