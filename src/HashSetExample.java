import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> uniqueUserIds = new HashSet<>();

        // O(1) insertions
        uniqueUserIds.add("usr_101");
        uniqueUserIds.add("usr_102");

        // Duplicates are ignored; returns false
        boolean addedAgain = uniqueUserIds.add("usr_101"); // false

        // O(1) containment check
        if (uniqueUserIds.contains("usr_102")) {
            System.out.println("User exists!");
        }
    }
}


//This ignores duplicates and Search, insertion, and deletion are O(1) on average.