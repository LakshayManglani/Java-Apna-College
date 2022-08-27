package _VQ;

public class _VQ_04_PrintLargestString {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };

        // Compare to : It don't takes a equal to A (A != a)
        // Compare to ignore Case : It takes a equal to A (A == a)

        // Compare Rules
        // 0 : equal
        // < 0 : -ve value (st1<st2)
        // > 0 : +ve value (st2>st2)

        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
