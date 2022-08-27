package _VQ;

public class _VQ_05_ConvertLettersToUpperCase {
    public static void main(String[] args) {
        String sentence = new String("hi, i am lakshay");

        System.out.println();
        upperCaseString(sentence);
        System.out.println();
    }

    public static void upperCaseString(String sentence) {
        StringBuilder upperCaseBuilder = new StringBuilder();

        upperCaseBuilder.append(Character.toUpperCase(sentence.charAt(0)));
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && i < sentence.length() - 1) {
                upperCaseBuilder.append(sentence.charAt(i));
                char temp = Character.toUpperCase(sentence.charAt(i + 1));
                upperCaseBuilder.append(temp);
                i++;
            } else {
                upperCaseBuilder.append(sentence.charAt(i));
            }
        }

        System.out.println(upperCaseBuilder);
    }
}