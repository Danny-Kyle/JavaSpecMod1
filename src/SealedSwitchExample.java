import java.util.List;

// 1. Sealed interface explicitly permitting only specific types
sealed interface SettlementEvent permits PaymentReceived, PaymentReversed, FeeApplied, FeeSubtracted {}

record PaymentReceived(String paymentId, long amountMinor) implements SettlementEvent {}
record PaymentReversed(String paymentId, long amountMinor) implements SettlementEvent {}
record FeeApplied(String paymentId, long feeMinor) implements SettlementEvent {}
record FeeSubtracted(String paymentId, long amountMinor) implements SettlementEvent {}
//void FeeSubtracted(String paymentId, long amountMinor)  {}

public class SealedSwitchExample {
    public static void main(String[] args) {
        List<SettlementEvent> events = List.of(
                new PaymentReceived("PAY-90312", 128450),
                new FeeApplied("PAY-90312", 500),
                new PaymentReversed("PAY-90312", 1000),
                new FeeSubtracted("PAY-90312", 1000)
        );

        long balance = 0;

        for (SettlementEvent event : events) {
            // Pattern matching switch extracts record fields directly and acts as an expression
            balance = switch (event) {
                case PaymentReceived(var id, var amount) -> balance + amount;
                case PaymentReversed(var id, var amount) -> balance - amount;
                case FeeApplied(var id, var fee) -> balance - fee;
                case FeeSubtracted(var id, var fee) -> balance - fee;

            };
        }

        System.out.println("Final Aurora Coffee Balance: " + balance + " minor units");
        // Expected output: 126950
    }
}