package DS;

public class Delete_Characters_to_Make_Fancy_String {
    public static void main(String[] args) {
        String s = "leeetcode";
        StringBuilder sb = new StringBuilder();
        char c[] = s.toCharArray();
        for (int i = 0; i < c.length-2; i++) {
            if(c[i]==c[i+1] && c[i]==c[i+2])
                c[i]=' ';
        }
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=' ')
                sb.append(c[i]);
        }
    }
}
