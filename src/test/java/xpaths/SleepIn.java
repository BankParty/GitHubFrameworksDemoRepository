package xpaths;

public class SleepIn {
    public static void main(String[] args) {
        boolean weekday = true; // Change to false if it's not a weekday
        boolean vacation = true; // Change to false if you're not on vacation

        boolean result = sleepIn(weekday, vacation);
        System.out.println("Do we sleep in? " + result);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // We sleep in if it's not a weekday or we're on vacation
        return !weekday || vacation;
    }
}
