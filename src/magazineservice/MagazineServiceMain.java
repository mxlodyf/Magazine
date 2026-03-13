package magazineservice;

public class MagazineServiceMain {
    static void main() {

        // ----------------
        // Set up magazines
        // ----------------
        System.out.println();
        System.out.println("Setting up magazine and supplements...\n");

        Magazine magazine = new Magazine("Popular Science", 3.50);
        Supplement scienceSupplement = new Supplement("Scientific Breakthrough of the Week",     1.00);
        Supplement techSupplement = new Supplement("Technology of the Week",     1.00);
        Supplement mathSupplement = new Supplement("Weekly Mathematics Challenge",     1.75);
        magazine.addSupplement(scienceSupplement);
        magazine.addSupplement(techSupplement);
        magazine.addSupplement(mathSupplement);
        System.out.println("'Popular Science' magazine created with weekly base cost of $3.50");
        System.out.println("Supplements added:");
        for (Supplement s : magazine.getAvailableSupplements()) {
            System.out.println("  " + s.getName());
        }
        System.out.println();

        // ----------------
        // Set up customers
        // ----------------
        System.out.println("Setting up customers...\n");

        PayingCustomer alice = new PayingCustomer(
                "Alice Johnson",
                "alice.johnson@email.com",
                new CreditCard("4111111111111234", "04/2027", "Alice Johnson")
        );
        alice.addSupplement(scienceSupplement);
        alice.addSupplement(techSupplement);

        System.out.println("+1 customer added to system: ");
        System.out.println("  Name: ");
        System.out.println("  Email: ");
        System.out.println("  Customer Type: ");
        if (alice.getCustomerType().equals("Paying Customer")) {
            System.out.println("  Payment Method: ");
        }
        System.out.println("  Supplements: ");
        for (Supplement s : alice.getSupplements()) {
            System.out.println("    " + s.getName());
        }
    }
}
