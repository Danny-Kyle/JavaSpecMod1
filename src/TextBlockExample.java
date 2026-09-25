public class TextBlockExample {
    public static void main(String[] args) {
        // Text block preserves formatting and line breaks cleanly
        var auditReport = """
                === LEDGER SETTLEMENT AUDIT ===
                Merchant: Aurora Coffee (MR-4471)
                Status: Verified Complete
                Action: None required
                """;

        System.out.println(auditReport);
    }
}