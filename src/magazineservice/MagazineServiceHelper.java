package magazineservice;

import java.util.ArrayList;

public class MagazineServiceHelper {

    Magazine magazine;

    public MagazineServiceHelper(Magazine magazine) {
        this.magazine = magazine;
    }

    void printSummaries() {

        printMagazineSummary();
        printSupplementSummary();
        printCustomerSummary();
    }

    void printMagazineSummary() {

        System.out.println();
        System.out.println("'Popular Science' magazine created with weekly base cost of $3.50");
        System.out.println();
    }

    void printSupplementSummary() {

        System.out.println("Supplements added:");
        for (Supplement s : magazine.getAvailableSupplements()) {
            System.out.println("  " + s.getName());
        }
        System.out.println();
    }

    void printCustomerSummary() {

        System.out.println("Customers added:");
        for (Customer c : this.magazine.getCustomers()) {
            System.out.printf("  Name: %s%n", c.getName());
            System.out.printf("  Email: %s%n", c.getEmail());
            System.out.printf("  Customer Type: %s%n", c.getCustomerType());
            if (c instanceof PayingCustomer) {
                System.out.printf("  Payment Method: %s%n", ((PayingCustomer) c).getPaymentMethod().getMethod());
            }
            System.out.println("  Supplements: ");
            for (Supplement s : c.getSupplements()) {
                System.out.println("    " + s.getName());
            }
            System.out.println();
        }
        System.out.println();
    }

}
