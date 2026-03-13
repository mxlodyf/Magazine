package magazineservice;

public class CreditCard extends PaymentMethod {

    private String cardNumber;
    private String expiryMonth;
    private String cardHolderName;

    /**
     * Constructs a CreditCard with the given number and holder name.
     *
     * @param cardNumber     the card number
     * @param cardHolderName the name on the card
     */
    public CreditCard(String cardNumber, String expiryMonth, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String getMethod() {
        return "Credit Card";
    }

    @Override
    public String getDescription() {
        String last4 = cardNumber.length() >= 4
                ? cardNumber.substring(cardNumber.length() - 4)
                : cardNumber;
        return "Credit Card ending in " + last4 + " (Holder: " + cardHolderName + ")";
    }
}
