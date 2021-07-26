package HW_TA_JAVA_2;

import java.util.Scanner;

public class Mercedes extends Car {
    Scanner carFields = new Scanner(System.in);


    public Mercedes() {
        this.brand = "Mercedes";
        System.out.println("Please enter model");
        this.model = carFields.nextLine();
    }

    public Mercedes(String model) {
        this.model = model;
    }
}
