package Week11.Date1128;

public class CombinationOfAlphabet2 {
    public static void main(String[] args) {
        // 두 글자 모든 경우의 수
        for (char d = 'A'; d <= 'Z' ; d++) {
            for (char c = 'A'; c < 'Z' ; c++) {
                System.out.printf("%s%s\n", d,c);
            }
        }
    }
}
