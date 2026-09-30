 import java.util.Scanner;
import java.util.Random;

public class game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        System.out.print("Enter your choice (1-3): ");
        int userChoice = sc.nextInt();

        // Validate user choice
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        // Computer chooses randomly
        int computerChoice = random.nextInt(3) + 1;

        System.out.println("You chose: " + choices[userChoice - 1]);
        System.out.println("Computer chose: " + choices[computerChoice - 1]);

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("It's a Draw!");
        } 
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You Win!");
        } 
        else {
            System.out.println("Computer Wins!");
        }

        sc.close();
    }
} 
    

