package DS;

public class Maximize_the_Confusion_of_an_Exam {
    public static void main(String[] args) {
        String ansKey = "TTFF";
        int k =2;
        int ct=0;
        int cf=0;
        int fct=0;
        int fcf=0;
        for (int i = 0; i < ansKey.toCharArray().length; i++) {
            char c = ansKey.charAt(i);
            if(c=='T')
            {
                ct++;
                fct=ct;
            }
            else if(ct>fct)
            {
                fct=ct;
            }
            if(c=='F')
            {
                cf++;
                fcf=cf;
            }
            else if(cf>fcf)
                fcf=cf;

        }
        String fin = "";
        for (int i = 0; i < ansKey.toCharArray().length; i++) {

            char c = ansKey.charAt(i);
            if(c=='F')
            {
                fin = ansKey.replace('F','T');
                System.out.println(fin);

            }
        }
        System.out.println(ansKey);
    }
}
