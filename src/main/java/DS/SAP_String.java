package DS;

public class SAP_String {
    public static void main(String[] args) {
        String s = "g  eeks   for ge  eeks  ";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c==' ')
                continue;
            else sb.append(c);
        }
        System.out.println(sb);
    }
}
