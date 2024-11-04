package ProjectStructures;

public class ArraySearchAndCount2 {
    public static void main(String[] args) {
        String[] array = {"Kartic", "Kartci","Ka", "Kartic"};
        String searchItem = "Kartic";
        int count = countOccurrences(array, searchItem);
        System.out.println("The item " + searchItem + " appears " + count + " times in the array.");
    }
    public static int countOccurrences(String[] array, String searchItem) {
        int count = 0;
        for (String item : array) {
            if (item == searchItem) {
                count++;
            }
        }
        return count;
    }
}
