package magazineservice;

public class CreditCard {

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
}
