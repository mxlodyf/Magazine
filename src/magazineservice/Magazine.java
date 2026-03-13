package magazineservice;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String name;
    private double weeklyMagazineCost;
    private List<Supplement> availableSupplements;
    private List<Customer> customers;

    public Magazine(String name, double weeklyMagazineCost) {
        this.name = name;
        this.weeklyMagazineCost = weeklyMagazineCost;
        this.availableSupplements = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
}
