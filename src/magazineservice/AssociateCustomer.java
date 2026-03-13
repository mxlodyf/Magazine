package magazineservice;

public class AssociateCustomer {

    private PayingCustomer payingCustomer;

    public AssociateCustomer(String name, String email, PayingCustomer payingCustomer) {
        super(name, email);
        this.payingCustomer = payingCustomer;
    }
}
