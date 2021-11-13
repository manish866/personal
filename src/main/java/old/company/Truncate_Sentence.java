package old.company;

public class Truncate_Sentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int  k = 4;
        StringBuilder sb =new StringBuilder();
        String[] str = s.split(" ");
        for (int i = 0; i < k; i++) {
            sb.append(str[i] + " ");

        }
        System.out.println(sb);
    }
}
