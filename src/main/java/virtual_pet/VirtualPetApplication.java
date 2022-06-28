package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice;
        boolean gameOver = false;
        int deadPets = 0;

        VirtualPetShelter gameShelter = new VirtualPetShelter();
        OrganicDog realDog = new OrganicDog("Myla", 7);
        OrganicCat realCat = new OrganicCat("Nala", 10);
        RoboticDog robotDog = new RoboticDog("Tank", 1);
        RoboticCat robotCat = new RoboticCat("Whiskers", 45);
        gameShelter.addPet(realDog);
        gameShelter.addPet(realCat);
        gameShelter.addPet(robotDog);
        gameShelter.addPet(robotCat);

        while (!gameOver) {
            for (VirtualPet pet : gameShelter.petShelter) {
                if (pet.isDead()) {
                    deadPets++;
                }
            }
            
            if (deadPets>=2) {
                gameOver = true;
            } else {
                displayMenu();
                choice = in.nextInt(); in.nextLine();

                switch (choice) {
                    case 0:
                        gameOver = true;
                        break;
                    case 1:
                        // Give the organic pets food
                        gameShelter.giveAllPetsFood();
                        break;
                    case 2:
                        // Give the organic pets water
                        gameShelter.giveAllPetsWater();
                        break;
                    case 3:
                        // Give the robotic pets oil
                        gameShelter.giveAllPetsOil();
                        break;
                    case 4:
                        // Maintain the robotic pets
                        gameShelter.maintainAllPets();
                        break;
                    case 5:
                        gameShelter.playWithAllPets();
                        break;
                    case 6:
                        gameShelter.walkAllPets();
                        break;
                    case 7:
                        gameShelter.cleanAllPetAreas();
                        break;
                    default:
                        System.out.println("Unknown choice...");
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println("What would you like to do with your shelter?");
        System.out.println("0: Quit");
        System.out.println("1: Feed the pets");
        System.out.println("2: Give the pets Water");
        System.out.println("3: Give the pets Oil");
        System.out.println("4: Maintain the pets");
        System.out.println("5: Play with all the pets");
        System.out.println("6: Take the dogs for a walk");
        System.out.println("7: Clean all the pets areas");
    }
}