package DS;

public class Kadens_Algo {
    public static void main(String[] args) {
        int arr [] = {-1,-2,-3,-4};
        int MEH=0;          //store addition of element;(Max ending here)
        int MSF=arr[0];     //Store addition of max elements(Max so far)
        for(int i=0;i<arr.length;i++)
        {
            MEH=MEH+arr[i];
            if(MSF<MEH);
                MSF=MEH;
                if (MEH<0)
                    MEH=0;


        }
        System.out.println(MEH);
    }
}
