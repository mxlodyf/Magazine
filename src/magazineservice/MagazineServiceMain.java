package magazineservice;

import java.util.ArrayList;
import java.util.List;

public class MagazineServiceMain {

    Magazine magazine;

    static void main() {

        MagazineTestData magazineTestData = new MagazineTestData();
        magazineTestData.setUpTestData();

        MagazineServiceHelper magazineServiceHelper = new MagazineServiceHelper(magazineTestData.getTestMagazine());
        magazineServiceHelper.printSummaries();
    }

}
