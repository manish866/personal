package DS;

public class Jewels_and_Stones {
    public static void main(String[] args) {
        String jewels= "aA";
        String stone="aAAbbbb";
        char[] je = jewels.toCharArray();
        char[] st = stone.toCharArray();
        int count=0;
        for (char c : je) {
            for (char c1 : st) {
                if(c==c1)
                    count++;

            }
        }
        System.out.println(count);
    }
}
