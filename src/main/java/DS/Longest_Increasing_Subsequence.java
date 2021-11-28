package DS;

public class Longest_Increasing_Subsequence {
    public static void main(String[] args) {
        int[] ar = {1, 2, 1, 5};
        int count=0;
        int max=0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i+1; j < ar.length; j++) {
                if(ar[i]<ar[j])
                {
                    count++;
                }
                else if(max<count)
                {
                    max=count;
                    break;
                }

            }

        }
        System.out.println(max);
    }
}
