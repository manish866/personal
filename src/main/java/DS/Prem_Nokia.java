package DS;

import java.util.ArrayList;
import java.util.List;

public class Prem_Nokia {
    public static void main(String[] args) {
        int answer[] = new int[100];
        int n = 11;
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<=n;i++)
        {
            boolean b = true;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    b = false;
                    break;
                }
            }
            if(b==true)
            {
                list.add(i);
            }
        }
        int result[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i]=list.get(i);
        }


    }

}
