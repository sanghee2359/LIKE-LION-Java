package Week11.Date1128;

public class CombinationOfAlphabet {
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        // 알파벳 한 글자 모든 경우의 수
        for (int i = 0; i < alphabet.length(); i++) {
            System.out.println(alphabet.charAt(i));
        }
    }
}
