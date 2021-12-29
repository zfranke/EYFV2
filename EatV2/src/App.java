import java.util.Random;
import java.util.Scanner;

public class App {

    public void pickupFood(player playername) {
        Random rand = new Random();
        // If player size is less then 1, add a random number to the players size to
        // simulate food pickup
        if (playername.getSize() < 1) {
            playername.setSize(playername.getSize() + rand.nextInt(10));
        }

    }

    public void takeDamage(player playername) {
        if (playername.getSize() > 0) {
            playername.removeSize(1);
        }
    }

    public void eatPlayer(player playername, player player2) {
        if (playername.getSize() > player2.getSize()) {
            System.out.println(playername.getName() + " ate " + player2.getName() + "!");
            player2.resetSize();
        } else {
            System.out.println(player2.getName() + " ate " + playername.getName() + "!");
            playername.resetSize();
        }
    }
    public static void main(String[] args) throws Exception {
        //Create two player objects
        player p1 = new player("Todd",5);
        player p2 = new player("Albert",5);

        //Print the size of each player
        System.out.println("Player 1 Size: " + p1.getSize());
        System.out.println("Player 2 Size: " + p2.getSize());

        //Create a new main object
        App game = new App();

        //Create input
        Scanner input = new Scanner(System.in);

        //Create a while loop to keep the game running with options for eating food, damage, check size, and attempting to eat another player. Use 9 as the exit condition
        int choice = 0;

        while (choice != 9) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Eat Food");
            System.out.println("2. Take Damage");
            System.out.println("3. Check Size");
            System.out.println("4. Eat Another Player");
            System.out.println("9. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            //Switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    game.pickupFood(p1);
                    game.pickupFood(p2);
                    break;
                case 2:
                    game.takeDamage(p1);
                    game.takeDamage(p2);
                    break;
                case 3:
                    System.out.println("Player 1 Size: " + p1.getSize());
                    System.out.println("Player 2 Size: " + p2.getSize());
                    break;
                case 4:
                    game.eatPlayer(p1, p2);
                    game.eatPlayer(p2, p1);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        
        System.out.println("Game Over!"); 

        //Close input
        input.close();

    }
}

