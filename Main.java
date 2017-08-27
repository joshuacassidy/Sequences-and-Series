
public class Main  {



    public static void main(String[] args) {


        for(int i = 0; i <= 10; i++){
            System.out.println("The Sum of the first " + i +" numbers: " + Series.nSum(i));
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(i +" factorial: " + Series.factorial(i));
        }
        for(int i = 0; i <= 10; i++){
            System.out.println("The " + i +" number of the fibonacci sequence: " + Series.fibonacci(i));
        }
    }
}
