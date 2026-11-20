import java.util.Scanner;
public class RandomClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        float answer = 0;

        System.out.print("Enter a number: ");
        num1 = input.nextInt();

        System.out.print("Enter a second number: ");
        num2 = input.nextInt();

        try {
            System.out.println("The division of your first by second number is: "+num1/num2);
        }
        catch (ArithmeticException e) {
            System.out.println("infinity");
        }
        input.close();
    }
}

