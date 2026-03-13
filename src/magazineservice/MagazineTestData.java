package magazineservice;

import java.util.List;

public class MagazineTestData {

    Magazine magazine;

    void setUpTestData() {
        setUpMagazine();
        setUpSupplements();
        setUpCustomers();
    }

    void setUpMagazine() {

        Magazine magazine = new Magazine("Popular Science", 3.50);
        this.magazine = magazine;
    }

    void setUpSupplements() {

        Supplement scienceSupplement = new Supplement("Scientific Breakthrough of the Week", 1.00);
        Supplement techSupplement = new Supplement("Technology of the Week", 1.00);
        Supplement mathSupplement = new Supplement("Weekly Mathematics Challenge", 1.75);
        this.magazine.addSupplement(scienceSupplement);
        this.magazine.addSupplement(techSupplement);
        this.magazine.addSupplement(mathSupplement);
    }

    void setUpCustomers() {
        List<Supplement> supplements = this.magazine.getAvailableSupplements();

        PayingCustomer alice = new PayingCustomer(
                "Alice Johnson",
                "alice.johnson@email.com",
                new CreditCard("4111111111111234", "04/2027", "Alice Johnson")
        );
        alice.addSupplement(supplements.getFirst());
        alice.addSupplement(supplements.get(1));

        PayingCustomer bob = new PayingCustomer(
                "Bob Smith",
                "bob.smith@email.com",
                new BankAccount("062-000", "12345678", "Bob Smith")
        );
        bob.addSupplement(supplements.get(2));

        AssociateCustomer carol = new AssociateCustomer(
                "Carol White",
                "carol.white@email.com",
                alice
        );
        carol.addSupplement(supplements.get(1));
        carol.addSupplement(supplements.get(2));
        alice.addAssociateCustomer(carol);

        this.magazine.addCustomer(alice);
        this.magazine.addCustomer(bob);
    }

    Magazine getTestMagazine() {
        return this.magazine;
    }
}
