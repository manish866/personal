package DS;

public class Minimize_Height {
    public static void main(String[] args) {
        int a[]={2 ,6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k=5,sum=0;
        int dup[] = new int[10];
        for(int i=0;i<a.length;i++)
        {
            dup[i]=a[i]-k;
            if(dup[i]<=0)
            {
                dup[i]=a[i]+k;
            }

        }
        for(int i=0;i<a.length;i++)
            System.out.println(dup[i]);

        int max=dup[0],min=dup[0];
        for(int i=0;i<a.length;i++)
        {
            if(dup[i]>max)
                max=dup[i];
            if (dup[i]<min)
                min=dup[i];

        }
        System.out.println("Result="+(max-min));
    }
}
