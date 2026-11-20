public class FactorialClass {
    public static long factorial(long n) {

        long res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;

    }

    public static void main(String[] args) {
        System.out.println("Factorial is: "+ factorial(15));
    }
}