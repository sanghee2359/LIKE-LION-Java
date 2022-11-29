package Week11.Date1128;

public class recurComination {
    public static void printAlphabet(char c){
        if(c > 'Z') return ;
        System.out.println(c);
        printAlphabet((char)(c+1));
    }

    public static void main(String[] args) {
        printAlphabet('A');
    }
}
