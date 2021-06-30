package DS;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        String s = "Hello World";
        StringBuffer str = new StringBuffer(s);
        System.out.println(str.reverse());
        String st = str.toString();
        int count=0;
        for (char c : st.toCharArray()) {
            if(c!=' ')
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}
