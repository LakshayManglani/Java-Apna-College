package _VQ;

public class _VQ_06_CompressString {
    public static void main(String[] args) {
        String uncompressed = "aaabbcccddd";

        System.out.println();
        compressString(uncompressed);
        System.out.println();
    }

    public static void compressString(String uncompressed) {
        if (uncompressed.charAt(uncompressed.length() - 1) == 'a') {
            uncompressed += 'b';
        } else {
            uncompressed += 'a';
        }

        StringBuilder compressed = new StringBuilder();
        Integer count = 1;

        for (int i = 0; i < uncompressed.length() - 1; i++) {
            if (count == 1) {
                compressed.append(uncompressed.charAt(i));
            }
            if (uncompressed.charAt(i) == uncompressed.charAt(i + 1)) {
                count++;
            } else if (count > 1) {
                compressed.append(count.toString());
                count = 1;
            }
        }

        System.out.println(compressed);
    }
}
