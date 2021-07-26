package HW_TA_JAVA_2;

import java.util.*;
import java.util.stream.Collectors;

public class UserActions {
    public List<Car> carList = new ArrayList();
    Scanner console = new Scanner (System.in);
    public void userActions() {
        try {
            Car car;
            EnumActions[] actions = EnumActions.values();
            String userChoiceString;

            do {
                System.out.println("You have the following options " + Arrays.toString(actions) + ", make your choice and type the action");
                EnumActions userChoice;
                userChoice = EnumActions.valueOf(console.nextLine());
                userChoiceString = userChoice.toString().toUpperCase(Locale.ROOT);

                switch (userChoiceString) {
                    case "ADD":
                        addCar();
                        break;
                    case "REMOVE":
                        removeCar();
                        break;
                    case "SHOW":
                        showCar();
                        break;
                    case "SORT":
                        sortCar();
                        break;
                    case "EXIT":
                        System.out.println("You successfully logged out");
                        break;
                }
            } while (!userChoiceString.equals("EXIT"));
        } catch (RuntimeException e) {
            System.out.println("Incorrect action, the program is closed");
        }
    }

    public enum EnumActions{
        ADD, REMOVE, SHOW, SORT, EXIT;
    }

    public void addCar(){
        System.out.println("Please chose brand: bmw or mercedes");
        String choiceAdd = console.nextLine();
        if (choiceAdd.equalsIgnoreCase("bmw")) {
            Car car = new BMW();
            carList.add(car);
        } else {
            Car car = new Mercedes();
            carList.add(car);
        }
    }
    public void  removeCar(){
        System.out.println("Please type number of car, you want to delete");
        int  choiceRemove = console.nextInt();
        carList.remove(choiceRemove);

    }
    public void showCar(){
        carList.stream().forEach(System.out::println);
    }
    public List<Car> sortCar(){
        carList = carList.stream().sorted(new CarComparator()).collect(Collectors.toList());
        return carList;
    }

}
