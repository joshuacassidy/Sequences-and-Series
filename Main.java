import java.util.*;

public class Main  {

    public static void main(String[] args) {
        long numberOfTerms;
        try( Scanner scanner = new Scanner( System.in )) {
            System.out.println("How many terms would you like of each series to be printed?");
            numberOfTerms = scanner.nextLong();
            compute(numberOfTerms);
        } catch (InputMismatchException e){
            System.out.println("Invalid input");
        }

    }

    public static void compute(long numberOfTerms) {
        String seriesType[] = {"Arithmetic", "Factorial", "Fibonacci"};
        for (String i: seriesType) {
            System.out.println("The first " + numberOfTerms + " terms of the " + i + " Series is: ");
            for (int j = 0; j < numberOfTerms; j++) {
                System.out.println("The Sum of the first " + j + " numbers: " + series(j,Arrays.asList(seriesType).indexOf(i)));
            }
        }
    }

    public static long series(int func,int choice){
        Long listOfSeries[] = { Series.nSum(func), Series.factorial(func), Series.fibonacci(func)};
        return listOfSeries[choice];
    }

}