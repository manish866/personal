package DS;

public class String_Without_AAA_or_BBB {
    public static void main(String[] args) {
        int a=4,b=1;
        StringBuilder sb = new StringBuilder();
        while (a>0 || b>0)
        {
            String s = sb.toString();
            if(s.endsWith("aa")) {
                sb.append('b');
                b--;
            }
            else if(s.endsWith("bb")) {
                sb.append("a");
                a--;
            }
            else if(a>b) {
                sb.append('a');
                a--;
            }
            else {
                sb.append('b');
                b--;
            }
        }
        System.out.println(sb);
    }
}
