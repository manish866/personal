package DS;

public class Reverse_String {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        String str = String.valueOf(s);
        StringBuilder fin = new StringBuilder(str);
        fin.reverse();
        String ste1 = fin.toString();
        char[] s1 = new char[fin.length()];
        for (int i = 0; i < s1.length; i++) {
            s1[i] = ste1.charAt(i);
        }
        for (char c : s1) {
            System.out.print(c);
        }
    }
}
