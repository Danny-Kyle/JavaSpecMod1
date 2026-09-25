import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> sortedScores = new TreeSet<>();

        // Inserts in O(log n) time
        sortedScores.add(85);
        sortedScores.add(42);
        sortedScores.add(99);
        sortedScores.add(73);

        // Always prints in natural sorted order: [42, 73, 85, 99]
        System.out.println("Sorted: " + sortedScores);

        // Navigable range operations: O(log n)
        System.out.println("Lowest: " + sortedScores.first()); // 42
        System.out.println("Scores >= 75: " + sortedScores.tailSet(75)); // [85, 99]
    }
}