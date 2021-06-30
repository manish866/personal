package com.company;

public class Stringg {
    public static void main(String[] args) {
        String s="Mani.sh";
        char[] chars = s.toCharArray();
        String result = "";
        for (char aChar : chars) {
            if(aChar == '.'){
                result += "(.)";
            }else{
                result += aChar;
            }
        }

        System.out.println(result);
    }
}
