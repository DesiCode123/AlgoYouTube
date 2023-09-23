/*
"Creating an Anagram Checker in Java: A Step-by-Step Tutorial"
Comparing two strings to determine whether they contain the same letters,
essentially checking if they are anagrams of each other
 */

import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "heiaa";
        String s2 = "aahei";
        System.out.println(isAnagram(s1,s2));

    }
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        s1 = s1.toUpperCase();
        s2 = s2.toUpperCase();

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array, s2Array);


    }

}
