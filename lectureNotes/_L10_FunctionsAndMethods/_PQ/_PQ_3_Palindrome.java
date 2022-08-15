package _PQ;

public class _PQ_3_Palindrome {
    public static void main(String[] args) {
        int num = 1221;

        System.out.println();
        isPalindrome(num);
        System.out.println();
    }

    // Check Palindrome
    public static boolean isPalindrome(int num) {
        int checkNum = num;
        int numReverse = 0;
        int count = 0;

        while (num > 0) {
            int lasDigit = num % 10;
            numReverse = numReverse * 10 + lasDigit;
            count++;
            num /= 10;
        }

        if (checkNum == numReverse) {
            System.out.println("Number " + checkNum + " is Palindrome");
            return true;
        } else {
            System.out.println("Number " + checkNum + " is Not Palindrome");
            return false;
        }
    }

}
