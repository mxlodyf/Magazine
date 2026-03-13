package magazineservice;

import java.util.ArrayList;
import java.util.List;

public class PayingCustomer extends Customer {

    private PaymentMethod paymentMethod;
    private List<AssociateCustomer> associateCustomers;

    public PayingCustomer(String name, String email, PaymentMethod paymentMethod) {
        super(name, email);
        this.paymentMethod = paymentMethod;
        this.associateCustomers = new ArrayList<>();
    }

    @Override
    public String getCustomerType() {
        return "Paying Customer";
    }
}
