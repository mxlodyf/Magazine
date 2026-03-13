package magazineservice;

public class AssociateCustomer extends Customer {

    private PayingCustomer payingCustomer;

    public AssociateCustomer(String name, String email, PayingCustomer payingCustomer) {
        super(name, email);
        this.payingCustomer = payingCustomer;
    }

    @Override
    public String getCustomerType() {
        return "Associate Customer";
    }
}
