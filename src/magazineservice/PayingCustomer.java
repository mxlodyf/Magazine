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

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public List<AssociateCustomer> getAssociateCustomers() {
        return associateCustomers;
    }

    public void addAssociateCustomer(AssociateCustomer associate) {
        if (!associateCustomers.contains(associate)) {
            associateCustomers.add(associate);
        }
    }

    public void removeAssociateCustomer(AssociateCustomer associate) {
        associateCustomers.remove(associate);
    }


    @Override
    public String getCustomerType() {
        return "Paying Customer";
    }
}
