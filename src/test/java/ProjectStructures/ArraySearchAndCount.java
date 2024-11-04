package ProjectStructures;

public class ArraySearchAndCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 1, 2, 1, 2, 3, 1};
        int searchItem = 1;
        int count = countOccurrences(array, searchItem);
        System.out.println("The item " + searchItem + " appears " + count + " times in the array.");
    }
    
    public static int countOccurrences(int[] array, int searchItem) {
        int count = 0;
        for (int item : array) {
            if (item == searchItem) {
                count++;
            }
        }
        return count;
    }
}