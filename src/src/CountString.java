public class CountString {
    public static void main(String[] args) {
        String s = "Madam";

        System.out.println(isPalindrom(s));

    }

    public static boolean isPalindrom(String s) {
        boolean result = false;
        String s1 = s.toUpperCase();
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            if (s1.charAt(low) != s.charAt(high)) {
                break;
            } else {
                return true;
            }
        }
        return result;
    }
}
