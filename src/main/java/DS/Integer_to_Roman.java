package DS;

import java.util.LinkedHashMap;
import java.util.Map;

public class Integer_to_Roman {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        int num = 9;
        map.put(1000,"M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            while (num>=entry.getKey())
            {
                num-=entry.getKey();
                sb.append(entry.getValue());
            }
        }
        System.out.println(sb);
    }
}
