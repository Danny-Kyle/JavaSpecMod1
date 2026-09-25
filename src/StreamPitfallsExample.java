import java.util.List;
import java.util.stream.Stream;

public class StreamPitfallsExample {
    public static void main(String[] args) {
        List<String> codes = List.of("GBP", "EUR", "USD");

        // PITFALL: Reusing a stream throws an IllegalStateException
        Stream<String> codeStream = codes.stream();
        long count1 = codeStream.count(); // This works fine

        try {
            // Trying to use the exact same stream instance again will crash!
            long count2 = codeStream.count();
        } catch (IllegalStateException e) {
            System.err.println("Caught expected error: Stream has already been operated upon or closed!");
        }

        // CORRECT APPROACH: Always create a fresh stream from the source
        long freshCount = codes.stream().count();
        System.out.println("Fresh stream count: " + freshCount);

        // WHEN A LOOP IS BETTER: Early exit (breaking out early)
        System.out.println("Searching for currency using a loop with early exit:");
        for (String code : codes) {
            if (code.equals("EUR")) {
                System.out.println("Found EUR! Breaking out early.");
                break; // Clean and easy in a loop, tricky to express cleanly in a basic stream
            }
        }
    }
}