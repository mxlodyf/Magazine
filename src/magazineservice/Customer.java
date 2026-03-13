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
}
