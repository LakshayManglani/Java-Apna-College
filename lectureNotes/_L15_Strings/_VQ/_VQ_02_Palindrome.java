package _VQ;

public class _VQ_02_Palindrome {
    public static void main(String[] args) {
        String toCheck = "";

        System.out.println();
        checkPalindrome(toCheck);
        System.out.println();
    }

    public static void checkPalindrome(String toCheck) {
        for (int i = 0; i < toCheck.length() / 2; i++) {
            if (toCheck.charAt(i) != toCheck.charAt(toCheck.length() - i - 1)) {
                System.out.print(toCheck + " is not Palindrome");
                return;
            }
        }
        System.out.println(toCheck + " is Palindrome");
    }
}
