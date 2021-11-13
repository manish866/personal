package DS;

public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "the sky is blue";
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append(str[str.length-1]);
        System.out.println(sb);
        for (int i = str.length - 2; i >= 0; i--) {
            sb.append(" "+str[i]);
        }
        System.out.println(sb);


    }
}
