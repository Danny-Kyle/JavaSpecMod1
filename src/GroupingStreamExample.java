import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingStreamExample {
    public static void main(String[] args) {
        List<Payment> payments = List.of(
                new Payment("P-1", "MR-4471", 128450),
                new Payment("P-2", "MR-4471", 40000),
                new Payment("P-3", "MR-8802", 75000)
        );

        // Group payments by merchant using Collectors.groupingBy and a method reference
        Map<String, List<Payment>> byMerchant = payments.stream()
                .collect(Collectors.groupingBy(Payment::merchantId));

        // Print out what's inside the map
        byMerchant.forEach((merchantId, paymentList) -> {
            System.out.println("Merchant " + merchantId + " has " + paymentList.size() + " payment(s).");
        });
    }
}