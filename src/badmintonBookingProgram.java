import java.util.ArrayList;
import java.util.Scanner;
public class badmintonBookingProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(14.95);
        prices.add(10.50);
        prices.add(18.99);
        prices.add(25.99);
        int choice = 0;

        System.out.print("""
                --- Badminton Court Booking --- 
                1. No Strings # Solo Court : £14.95
                2. No Strings # Duo Court : £10.50
                3. Organised Tourney # Solos Court : £18.99
                4. Organised Tourney # Duos Court : £25.99
                --- End Of Results ---
                Enter your booking choice:  """);
        choice = input.nextInt();
        System.out.println("---------------------------");
        if(choice == 1) {
            System.out.println("No Strings # Solo Court");
            System.out.println("You will be charged: £14.95");
        }
        else if(choice == 2) {
            System.out.println("No Strings # Duo Court");
            System.out.println("You will be charged: "+ prices.get(0));
        }
        else if(choice == 3) {
            System.out.println("Organised Tourney # Solos Court");
            System.out.println("You will be charged: "+ prices.get(choice));
        }
        else if(choice == 4) {
            System.out.println("Organised Tourney # Duos Court");
            System.out.println("You will be charged: "+ prices.get(choice));
        }
        else {
            System.out.println("Invalid choice!");
        }
    }
}