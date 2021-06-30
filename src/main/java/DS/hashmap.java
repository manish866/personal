package DS;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        Map<String,String> phonebook = new HashMap<>();
        phonebook.put("manish","8660431106");
        phonebook.put("Rupuk","123");
        System.out.println(phonebook.get("manish"));
        Set<String> Keys = phonebook.keySet();
        for (String i : Keys)
        {
            System.out.println(i+" "+phonebook.get(i));
        }


    }
}
