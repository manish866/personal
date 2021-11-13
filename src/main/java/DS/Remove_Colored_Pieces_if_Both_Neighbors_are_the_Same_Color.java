package DS;

public class Remove_Colored_Pieces_if_Both_Neighbors_are_the_Same_Color {
    public static void main(String[] args) {
        String colors = "ABBBBBBBAAA";
        int totalA = 0;
        int totalB = 0;
        int contA = 0;
        int contB = 0;
        for (char c : colors.toCharArray()) {
            if(c=='A')
            {
                totalA+=1;
                if(totalA==3)
                {
                    contA+=1;
                    totalA=0;
                }
            }
            else
                totalA=0;
            if(c=='B')
            {
                totalB+=1;
                if(totalB==3)
                {
                    contB+=1;
                    totalB=0;
                }
            }
            else totalB=0;
        }
        System.out.println(contA);
        System.out.println(contB);
    }
}
