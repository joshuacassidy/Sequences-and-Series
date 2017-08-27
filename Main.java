import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {



    public static void main(String[] args) {
        long numberOfTerms = 0;

        try( Scanner in = new Scanner( System.in )) {
            System.out.println("How many terms would you like of each series to be printed?");
            numberOfTerms = in.nextLong();

            System.out.println("The first " + numberOfTerms + " terms of the Arithmetic Series is: ");
            for(int i = 0; i < numberOfTerms; i++){
                System.out.println("The Sum of the first " + i +" numbers: " + Series.nSum(i));
            }

            System.out.println("The first " + numberOfTerms + " terms of the Factorial Series is: ");

            for(int i = 0; i < numberOfTerms; i++){
                System.out.println(i +" factorial: " + Series.factorial(i));
            }

            System.out.println("The first " + numberOfTerms + " terms of the Fibonacci Series is: ");
            for(int i = 0; i < numberOfTerms; i++){
                System.out.println("The " + i +" number of the fibonacci sequence: " + Series.fibonacci(i));
            }

        } catch (InputMismatchException e){
            System.out.println("Invalid input");
        }


    }
}