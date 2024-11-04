package base;

public class FindDuplicatenumbers {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 3, 6, 5};
        System.out.println("Duplicates found:");

        // Outer loop iterates over each element
        for (int i = 0; i < arr.length; i++) {
            // Inner loop compares the current element with the rest of the array
            for (int j = i + 1; j < arr.length; j++) {
                // If duplicate found, print it
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] +" ");
                    break;  // Break to avoid printing the same duplicate multiple times
                }
            }
        }
    }
}