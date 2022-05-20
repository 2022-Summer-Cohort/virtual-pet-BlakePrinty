package virtual_pet;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String petName; // Dogs name
        String petBreed; // Dogs breed
        int petAge; // Dogs age
        int petHungerLevel = 100; // Dogs hunger level
        int petHappinessLevel = 100; // Dogs happiness level
        boolean petIsTired = false; // Whether the dog is tired
        boolean dogNapping = false; // Flag for when the application will end

        // Menu Codes
        int choice = -1;

        // Get the information about the dog
        System.out.println("What is the name of your dog?");
        petName = input.nextLine();
        System.out.println("What is your dogs breed?");
        petBreed = input.nextLine();
        System.out.println("How old is your dog?");
        petAge = input.nextInt();
        input.nextLine();

        Dog userDog = new Dog(petName, petBreed, petAge, petHungerLevel, petHappinessLevel, petIsTired);

        while (!dogNapping) {
            System.out.println("\nWhat would you like to do with " + userDog.getName() + "?");

            if (userDog.getIsTired()) {
                dogNapping = true;
            } else {
                DisplayMenu(); // Display the menu options
                choice = input.nextInt();
                input.nextLine();

                switch(choice) {
                    case 0:
                        dogNapping = true; // End the game the dog wants to sleep
                        break;
                    case 1:
                        userDog.playFetch(); // Play fetch
                        break;
                    case 2:
                        userDog.feedPet(); // Feed the dog
                        break;
                    default:
                        System.out.println("Unknown command...");
                }
            }
        }

        System.out.println("");
        System.out.println(userDog.getName() + " was happy you played with them!");
    }

    public static void DisplayMenu() {
        System.out.println("Quit: 0");
        System.out.println("Play Fetch: 1");
        System.out.println("Feed Dog: 2");
    }

}
