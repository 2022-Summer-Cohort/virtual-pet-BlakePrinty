package virtual_pet;

import java.util.Random;

public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int happiness;

    public VirtualPet(String name, int hunger, int thirst, int happiness) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getHappiness() {
        return happiness;
    }

    public void giveFood() {
        if (hunger+2 > 10) {
            hunger = 10;
        } else {
            hunger += 2;
        }
    }

    public void giveWater() {
        if (thirst+2 > 10) {
            thirst = 10;
        } else {
            thirst += 2;
        }
    }

    public void playWithPet() {
        if (happiness+2 > 10) {
            happiness = 10;
        } else {
            happiness += 2;
        }
        hunger -= 1;
        thirst -= 1;

        System.out.println("You threw a ball and played fetch with " + ANSI_CYAN + getName() + ANSI_RESET);
    }

    public void displayHunger() {
        int count = 0;
        System.out.print(ANSI_PURPLE + "Hunger: " + ANSI_RESET);
        for (int i = 0; i < getHunger(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getHunger()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getHunger() == 0) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }

    public void displayThirst() {
        int count = 0;
        System.out.print(ANSI_BLUE + "Thirst: " + ANSI_RESET);
        for (int i = 0; i < getThirst(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getThirst()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }if (getThirst() == 0) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }

    public void displayHappiness() {
        int count = 0;
        System.out.print(ANSI_YELLOW + "Happiness: " + ANSI_RESET);
        for (int i = 0; i < getHappiness(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getHappiness()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getHappiness() == 0) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }

    public void displayStats() {
        displayHunger();
        displayThirst();
        displayHappiness();
    }

    public boolean isAlive() {
        return getHunger() != 0 && getThirst() != 0 && getHappiness() != 0;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////

    public void tick() {
        happiness -= 1;

        if (getRandomBoolean()) {
            System.out.println(ANSI_CYAN + getName() + ANSI_RESET + " found the water and drank some on their own.");
            giveWater();
        }

        if (getHunger() <= 6) {
            System.out.println(ANSI_CYAN + getName() + ANSI_RESET + " is hungry.");
        }
        if (getThirst() <= 6) {
            System.out.println(ANSI_CYAN + getName() + ANSI_RESET + " is thirsty.");
        }
        if (getHappiness() <= 6) {
            System.out.println(ANSI_CYAN + getName() + ANSI_RESET + " wants to play.");
        }

        displayStats();
    }

    public boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }

    // Text Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_GRAY = "\u001b[30;1m";

    // Backgrounds
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
}


