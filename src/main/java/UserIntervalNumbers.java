import java.util.ArrayList;
import java.util.Scanner;

public class UserIntervalNumbers implements SumOddEven {
    private int firstNumber;
    private int lastNumber;
    private ArrayList<Integer> interval;
    Scanner in = new Scanner(System.in);

    public int getFirstNumber() {

        System.out.println("Please enter first integer number");
        do {
            if (in.hasNextInt()) {
                firstNumber = in.nextInt();
                break;
            } else {
                System.out.println("Incorrect number, please try again");
                in.next();
            }
        } while (true);

        return firstNumber;
    }


    public int  getLastNumber(){
        System.out.println("Please enter second  integer number, bigger than the first");

    do {
           if (in.hasNextInt()) {
                lastNumber = in.nextInt();
               break;
            } else {
                System.out.println("Incorrect number, please try again");
                in.next();
           }

       } while(true);

        return lastNumber;
    }



    public ArrayList<Integer> getInterval(){
        ArrayList<Integer> interval = new ArrayList();
        firstNumber= getFirstNumber();
        lastNumber= getLastNumber();
        for (int i = firstNumber; i <= lastNumber; i++) {
            interval.add(i);
        }
        return interval;
    }


    @Override
    public void sum(ArrayList<Integer> forCalculation) {
        int oddSum = forCalculation.stream().filter(і -> і % 2 != 0).mapToInt(i-> i).sum();
        int evenSum = forCalculation.stream().filter(і -> і % 2 == 0).mapToInt(i-> i).sum();

        System.out.println("sum of odd numbers is = "+oddSum +" ,sum of even numbers is = "+evenSum);
    }
}
