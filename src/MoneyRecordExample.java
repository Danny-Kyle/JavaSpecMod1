import java.util.HashMap;
import java.util.Map;

// Record with a compact constructor for validation
record Money(long amountMinor, String currency) {
    public Money{
        if (currency == null || currency.isBlank() || currency.length() != 2) {
            throw new IllegalArgumentException("Currency is required!");
        }
    }
}

public class MoneyRecordExample {
    public static void main(String[] args) {
        Map<Money, String> ledgerBalances = new HashMap<>();

        Money m1 = new Money(128450, "GBP");
        Money m2 = new Money(128453, "GBP"); // Different object reference, identical values

        // Storing using m1 as a key
        ledgerBalances.put(m1, "Aurora Coffee Account");

        // Lookup using m2 succeeds because records share generated equals and hashCode!
        System.out.println("Does ledger contain m2 key? " + ledgerBalances.containsKey(m2));
        System.out.println("Retrieved description: " + ledgerBalances.get(m2));
    }
}