public class fibonacciSequence {

    public static int fib(int n) {
        if (n == 1 || n ==2) {
            return 1;
        }
        return fib(n -1) + fib(n - 2);
    }
    public static void main(String[] args) {
        int terms = 10;

        System.out.println("Fibonacci sequences up to term " + terms + ":");
        for(int i = 1; i <= terms; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}