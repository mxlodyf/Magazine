package magazineservice;

public class BankAccount extends PaymentMethod {

    private String bsb;
    private String accountNumber;
    private String accountHolderName;

    public BankAccount(String bsb, String accountNumber, String accountHolderName) {
        this.bsb = bsb;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    @Override
    public String getMethod() {
        return "Bank Account";
    }

    @Override
    public String getDescription() {
        return "Direct Debit from Bank Account BSB: " + bsb
                + ", Account: " + accountNumber
                + " (Holder: " + accountHolderName + ")";
    }
}
