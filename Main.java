import java.util.*;

public class Main  {

    public static void main(String[] args) {
        long numberOfTerms;
        System.out.print("\033[H\033[2J");
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
            System.out.printf("The first %d terms of the %s Series is: \n",numberOfTerms,i);
            for (int j = 0; j < numberOfTerms; j++) {
                System.out.printf("The %d term of the %s Series is: %d \n",j,i, series(j,Arrays.asList(seriesType).indexOf(i)));
            }
        }
    }

    public static long series(int func,int choice){
        Long listOfSeries[] = { Series.nSum(func), Series.factorial(func), Series.fibonacci(func)};
        return listOfSeries[choice];
    }

}