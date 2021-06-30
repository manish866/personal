package DS;

public class Missing_No_Repeating_No {
    public static void main(String[] args) {
        int ar[] = {7, 3, 4, 5, 5, 6, 2};
        int dup=0,sum=0,tsum=0;
        for(int i=0;i<ar.length;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if(ar[i]==ar[j])
                    dup=ar[i];
            }
        }
        for(int i=1;i<ar.length+1;i++)
        {
            tsum=tsum+i;
        }

        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        int msi=tsum-(sum-dup);
        System.out.println("Repated number:"+dup);
        System.out.println("Missing Number:"+msi);
    }
}
