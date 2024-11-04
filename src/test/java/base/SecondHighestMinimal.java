package base;

public class SecondHighestMinimal {

	public static void main(String[] args) {
        int[] numbers = {10, 20, 35, 40, 50, 50, 60, 5};
        System.out.println("Second highest: " + findSecondHighest(numbers));
    }

    public static int findSecondHighest(int[] numbers) {
        int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        return secondHighest;
    }
}