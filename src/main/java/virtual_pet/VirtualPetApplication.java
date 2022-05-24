package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Pet parameters
        String petName;
        int petHungerLevel = 100;
        int petStaminaLevel = 100;
        int petThirstLevel = 100;

        // Flags
        int choice;
        boolean isTired = false;

        // Get the information from the user about the pet
        System.out.println("What is the name of your pet?");
        petName = in.nextLine();

        // Create the pet
        VirtualPet userPet = new VirtualPet(petName, petHungerLevel, petStaminaLevel, petThirstLevel);

        // Run the game
        while (!isTired) {
            if (userPet.getStaminaLevel() <= 10) {
                // Stop the game if the pet is out of stamina
                isTired = true;
            } else {
                // Let the dog tell the user their needs
                userPet.tick();

                // Let the user choose what they want to do with their pet
                displayMenu();
                choice = in.nextInt();
                in.nextLine();

                switch (choice) {
                    case 0:
                        isTired = true;
                        break;
                    case 1:
                        userPet.givePetFood();
                        break;
                    case 2:
                        userPet.givePetRest();
                        break;
                    case 3:
                        userPet.givePetWater();
                        break;
                    case 4:
                        userPet.playWithPet();
                        break;
                    default:
                        System.out.println("Unknown option chosen...");
                }
            }
        }

        System.out.println("\nYou finished playing with " + userPet.getName());
    }

    public static void displayMenu() {
        System.out.println("\nWhat would you like to do?");
        System.out.println("0. Quit");
        System.out.println("1. Give pet food");
        System.out.println("2. Give pet a rest");
        System.out.println("3. Give pet water");
        System.out.println("4. Play with pet");
    }

}
