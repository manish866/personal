package DS;

public class Final_Value_of_Variable_After_Performing_Operations {
    public static void main(String[] args) {
        String[] operations= {"++X","++X","X++"};
        int x=0;
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i])
            {
                case "--X":x=x-1;
                    break;
                case "++X":x=x+1;
                    break;
                case "X++":x=x+1;
                    break;
                case "X--":x=x-1;
                break;
            }
        }
        System.out.println(x);
    }
}
