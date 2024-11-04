package xpaths;

public class MonkeyTrouble {
    public static void main(String[] args) {
        boolean aSmile = true; // Change to false if monkey 'a' is not smiling
        boolean bSmile = true; // Change to false if monkey 'b' is not smiling

        boolean result = monkeyTrouble(aSmile, bSmile);
        System.out.println("Are we in trouble? " + result);
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        // We are in trouble if they are both smiling or if neither of them is smiling
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
}