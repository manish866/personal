package DS;

public class Move_Neg_Number {
    public static void main(String[] args) {
        int ar[] = {-1, 2, -3, 4, 5, 8, -7, 8, 9};
        int dup[] = new int[ar.length];
        int j=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<0)
            {
                dup[j]=ar[i];
                j++;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0)
            {
                dup[j]=ar[i];
                j++;
            }

        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(dup[i]);

        }
    }
}

