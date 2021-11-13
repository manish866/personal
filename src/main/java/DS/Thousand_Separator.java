package DS;

public class Thousand_Separator {
    public static void main(String[] args) {
        int n = 123456789;
        String num = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if(i!=0 && i%3==0)
                sb.append('.');
            sb.append(num.charAt(i));
        }
        System.out.println(sb);
    }
}
