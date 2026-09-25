import java.util.Optional;

// Custom exception — was used but never defined in the original code.
// Extending RuntimeException makes it unchecked, so it doesn't force
// every caller to declare "throws MerchantNotFoundException".
class MerchantNotFoundException extends RuntimeException {
    public MerchantNotFoundException(String merchantId) {
        super("Merchant not found: " + merchantId);
    }
}

class SafePracticesExample {

    public void safeHandling(Optional<String> merchantOpt) {
        try {
            // DANGEROUS (avoid): calling .get() blindly throws
            // NoSuchElementException if the Optional is empty.
            // String bad = merchantOpt.get();

            // CORRECT: orElseThrow must live INSIDE the try block.
            // In the original code it was outside, so the exception it
            // throws would never reach the catch below — the program
            // would just crash instead of being handled.
            String name = merchantOpt.orElseThrow(
                    () -> new MerchantNotFoundException("MR-9999"));

            System.out.println("Merchant found: " + name);

            // ... rest of the risky operation would go here ...

        } catch (MerchantNotFoundException e) {
            // CORRECT: log the error message. Never leave a catch block empty!
            System.err.println("Caught expected ledger error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SafePracticesExample example = new SafePracticesExample();

        System.out.println("Case 1: empty Optional");
        example.safeHandling(Optional.empty());

        System.out.println("\nCase 2: present Optional");
        example.safeHandling(Optional.of("Zenith Foods"));
    }
}