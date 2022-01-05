import java.util.Random;
import java.util.Scanner;

public class App {

    public void pickupFood(player playername) {
        Random rand = new Random();
        // If player size is less then 1, add a random number to the players size to
        // simulate food pickup
        if (playername.getSize() > 1) {
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
            
        } else {
            System.out.println(player2.getName() + " ate " + playername.getName() + "!");
            
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
            System.out.println("5. Reset Test Characters");
            System.out.println("9. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();

            //Switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    System.out.print(" ");
                    System.out.print("Eat Food: Selected");
                    System.out.print(" ");
                
                    game.pickupFood(p1);
                    game.pickupFood(p2);

                    System.out.println("\nPlayer 1 Ate, Current Size: " + p1.getSize());
                    System.out.println("\nPlayer 2 Ate, Current Size: " + p2.getSize());

                    System.out.print(" ");
                    System.out.print(" ");
                    break;
                case 2:

                    System.out.print(" ");
                    System.out.print("Damage Players: Selected");
                    System.out.print(" ");

                    game.takeDamage(p1);
                    game.takeDamage(p2);

                    System.out.println("\nPlayer 1 Damaged, Current Size: " + p1.getSize());
                    System.out.println("\nPlayer 2 Damaged, Current Size: " + p2.getSize());

                    System.out.print(" ");
                    System.out.print(" ");
                    break;
                case 3:
                    System.out.print(" ");
                    System.out.print("Check Size: Selected");
                    System.out.print(" ");

                    System.out.println("\nPlayer 1 Size: " + p1.getSize());
                    System.out.println("\nPlayer 2 Size: " + p2.getSize());

                    System.out.print(" ");
                    System.out.print(" ");
                    break;
                case 4:
                    System.out.print(" ");
                    System.out.print("\nEat Another Player: Selected");
                    System.out.print(" ");
                    System.out.print(" ");

                    game.eatPlayer(p1, p2);

                    System.out.print(" ");
                    System.out.print(" ");
                   
                    break;
                case 5:
                    System.out.print(" ");
                    System.out.print("\nReset Test Characters: Selected");
                    System.out.print(" ");

                    p1.resetSize();
                    p2.resetSize();

                    System.out.println("\nPlayer 1 Size: " + p1.getSize());
                    System.out.println("\nPlayer 2 Size: " + p2.getSize());

                    System.out.print(" ");
                    System.out.print(" ");
                    break;
                case 9:
                    System.out.print(" ");
                    System.out.println("Exiting...");
                    System.out.print(" ");
                    System.out.print(" ");
                    break;
                default:
                    System.out.print(" ");
                    System.out.println("Invalid choice");
                    System.out.print(" ");
                    System.out.print(" ");

                    break;
            }
        }
        
        System.out.println("Game Over!"); 

        //Close input
        input.close();

    }
}

