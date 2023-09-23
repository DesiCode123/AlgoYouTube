/*
Checking if a String is a Palindrome in Java
 */

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));


    }

    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(low) != s.charAt(high)) {
                break;
            } else {
                low++;
                high--;
            }
        }


        return true;
    }
}