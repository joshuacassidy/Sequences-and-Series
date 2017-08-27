public class Series {


    public static long nSum(int n){
        return (n * (n + 1)) /2;
    }

    public static long factorial(int n){
        long fact = 1;
        for (int i = 1; i <= n;i++){
            fact *= i;
        }
        return fact;
    }

    public static long fibonacci(int n){
        if (n < 2) {
            return n;
        }
        long x = 1;
        long y = 0;
        long output = 0;
        for(int i = 1; i < n; i++){
            output = x + y;
            y = x;
            x = output;
        }
        return output;
    }

}
