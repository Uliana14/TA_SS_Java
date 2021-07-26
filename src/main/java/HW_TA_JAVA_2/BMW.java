package HW_TA_JAVA_2;

import java.util.Scanner;

public class BMW extends Car {
    Scanner carFields = new Scanner(System.in);

    public BMW() {
        this.brand = "BMW";
        System.out.println("Please enter model");
        this.model = carFields.nextLine();
    }

    public BMW(String model) {
        this.model = model;
    }
}
