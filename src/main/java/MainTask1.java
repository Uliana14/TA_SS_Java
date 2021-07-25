import java.util.ArrayList;
import java.util.Scanner;

public class MainTask1 {
    public static void main(String[] args) {
        // Закрити сканер,  подумати над звязками між класами, або інтерфейсами
     UserIntervalNumbers userObj = new UserIntervalNumbers();
     ArrayList<Integer>  userInterval = userObj.getInterval();
     userObj.sum(userInterval);

        BuildFibonacci buildFibonacci = new BuildFibonacci();
        ArrayList<Integer> fibonacci = buildFibonacci.FibonacciNumbers(userInterval);
        buildFibonacci.PercentageFibonacci(fibonacci);

}

    }



