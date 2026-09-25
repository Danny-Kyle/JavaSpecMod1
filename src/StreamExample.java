import java.util.List;

// Simple Payment record for the demo

public class StreamExample {
    public static void main(String[] args) {
        // 1. Setup mock data (Three for MR-4471, one for another merchant)
        List<Payment> payments = List.of(
                new Payment("P-1", "MR-4471", 128450),
                new Payment("P-2", "MR-4471", 40000),
                new Payment("P-3", "MR-4471", 12000),
                new Payment("P-4", "MR-8802", 50000)
        );

        // 2. Run the stream pipeline: Filter -> Map to long -> Sum
        long totalForAurora = payments.stream()
                .filter(p -> p.merchantId().equals("MR-4471"))
                .mapToLong(Payment::amountMinor)// Method reference
                .sum();

        System.out.println("Total owed to Aurora Coffee (MR-4471): " + totalForAurora + " pence");
        // Expected output: 180450
    }
}