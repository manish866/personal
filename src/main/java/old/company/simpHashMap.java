package com.company;

import java.util.HashMap;

public class simpHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> happy = new HashMap<String, Integer>();
        happy.put("a",10);
        happy.put("b",20);
        System.out.println(happy);
        System.out.println(happy.get("a"));
        happy.remove("a");
        System.out.println(happy);
        System.out.println(happy.containsValue(20));
        System.out.println(happy.containsKey("b"));
    }
}
