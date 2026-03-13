package magazineservice;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String email;
    private List<Supplement> supplements;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.supplements = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Supplement> getSupplements() {
        return supplements;
    }

    public void addSupplement(Supplement supplement) {
        if (!supplements.contains(supplement)) {
            supplements.add(supplement);
        }
    }

    public void removeSupplement(Supplement supplement) {
        supplements.remove(supplement);
    }

    public String getCustomerType() {
        return "Standard Customer";
    }

    @Override
    public String toString() {
        return getCustomerType() + " | Name: " + name + " | Email: " + email
                + " | Supplements: " + supplements.size();
    }

}
