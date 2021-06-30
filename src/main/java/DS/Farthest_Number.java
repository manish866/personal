package DS;

public class Farthest_Number {
    public static void main(String[] args) {
        int ar[] = {3, 1, 5, 2, 4};
        int[] res= new int[ar.length+1];
        for (int i=0;i<res.length;i++)
        {
            res[i]=-1;
        }
        int h=ar.length-1;
        for(int i=ar.length;i>0;i++)
        {
            if(ar[i]<ar[h])
                res[i]=h;
        }
        for(int i=0;i<ar.length;i++)
            System.out.println(res[i]);
    }
}
