import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class BuildFibonacci {
    private int size;
    private int fistFibonacci;
    private int secondFibonacci;
    private  int tempFibonacci;
    Scanner in = new Scanner (System.in);

       public int  getSize(){
          System.out.println("Please enter integer number for Fibonacci");
         do {
             if (in.hasNextInt()) {
                 size = in.nextInt();
                break;
             } else {
                System.out.println("Incorrect number, please try again");
                in.next();
             }
         } while(true);

           return size;
    }

    public ArrayList<Integer> FibonacciNumbers(ArrayList<Integer> forCalculation) {
           size=getSize();
        int secondFibonacci = forCalculation.stream().filter(і -> і % 2 == 0).max(Integer::compare).get();
        int fistFibonacci = forCalculation.stream().filter(і -> і % 2 != 0).max(Integer::compare).get();
        ArrayList<Integer> fibonacci = new ArrayList();
        fibonacci.add(fistFibonacci);
        fibonacci.add(secondFibonacci);
        for (int i = 3; i <= size; i++) {
            tempFibonacci = fistFibonacci + secondFibonacci;
            fistFibonacci = secondFibonacci;
            secondFibonacci = tempFibonacci;
            fibonacci.add(tempFibonacci);
        }
        return fibonacci;
    }

     public void PercentageFibonacci(ArrayList<Integer> fibonacci){
         long  calculateEven = fibonacci.stream().filter(і->і%2 == 0).count();
         long  calculateOdd = fibonacci.stream().filter(і->і%2 != 0).count();
         long calculateAll = fibonacci.stream().count();
         double percentageEven = (double)calculateEven/calculateAll*100;
         double percentageOdd = (double)calculateOdd/calculateAll*100;
         System.out.println("percentage of even is "+percentageEven+ ", percentage of odd is " + percentageOdd);
        }

        }


