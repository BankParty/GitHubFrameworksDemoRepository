package xpaths;

public class SumDouble {
    public static void main(String[] args) {
        int a = 5; // Change to any integer value
        int b = 4; // Change to any integer value

        int result = sumDouble(a, b);
        System.out.println("Result: " + result);
    }

    public static int sumDouble(int a, int b) {
        // Check if the two values are the same
        if (a == b) {
            // If the values are the same, return double their sum
            return 2 * (a + b);
        } else {
            // Otherwise, return their sum
            return a + b;
        }
    }
}