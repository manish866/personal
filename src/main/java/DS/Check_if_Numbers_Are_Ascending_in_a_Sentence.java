package DS;

import java.util.ArrayList;
import java.util.List;


public class Check_if_Numbers_Are_Ascending_in_a_Sentence {
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        String[] str = s.split(" ");

        List<Integer> list = new ArrayList<>();
        for (String c : str) {
            try{
                list.add(Integer.parseInt(c));
            } catch (Exception e){

            }
        }
        for (int i = list.size()-1; i > 0; i--) {
            if(list.get(i)>list.get(i-1))
                continue;
            else System.out.println("false");
        }

    }
}
