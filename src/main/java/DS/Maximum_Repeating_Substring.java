package DS;

public class Maximum_Repeating_Substring {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        int count=0;
        StringBuilder res = new StringBuilder();
        while(sequence.contains(res.append(word).toString()))
        count++;
        System.out.println(count);
    }
}
