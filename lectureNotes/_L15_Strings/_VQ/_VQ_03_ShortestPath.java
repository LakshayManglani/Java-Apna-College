package _VQ;

public class _VQ_03_ShortestPath {
    public static void main(String[] args) {
        String path = "WNEENESENNN";

        System.out.println();
        calculateShortestPath(path);
        System.out.println();
    }

    public static void calculateShortestPath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'W') {
                // West
                y++;
            } else if (path.charAt(i) == 'E') {
                // East
                y--;
            } else if (path.charAt(i) == 'N') {
                // North
                x++;
            } else {
                // South
                x--;
            }
        }

        double ans = Math.sqrt((x * x + y * y));
        System.out.println("Shortest Path : " + ans);
    }
}
