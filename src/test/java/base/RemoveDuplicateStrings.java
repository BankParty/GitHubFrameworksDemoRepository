package base;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateStrings {

	public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("grape");

        System.out.println("Original list: " + strings);

        // Remove duplicates using a LinkedHashSet to preserve order
        List<String> uniqueStrings = new ArrayList<>(new LinkedHashSet<>(strings));

        System.out.println("List after removing duplicates (order preserved): " + uniqueStrings);
    }
}