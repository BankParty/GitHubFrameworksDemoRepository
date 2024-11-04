package base;  // Declares that this class is part of the 'base' package

public class LargestValue {  // Defines a public class named LargestValue

    public static void main(String[] args) {  // Main method, the entry point of the program

        int[] arr = {28, 3, 15, 9, 17, 4, 23, 2};  // Initializes an integer array 'arr' with a set of values

        int val = arr[0];  // Sets 'val' to the first element in the array, initializing it as the largest value found so far

        for (int i = 0; i < arr.length; i++) {  // Loops through each element in the array from index 0 to the end
            if (arr[i] > val) {  // Checks if the current element 'arr[i]' is greater than 'val'
                val = arr[i];  // Updates 'val' to the current element if it is larger
            }
        }
        
        System.out.println("Largest value in the Given Array is " + val);  // Prints the largest value found in the array
    }
}
