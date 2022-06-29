package virtual_pet;

import java.util.Random;

public class OrganicDog extends OrganicPet {
    private int cageCleanliness;
    private String noise;

    public OrganicDog(String name, int age) {
        super(name, age);
        this.cageCleanliness = rand.nextInt(10);
        this.noise = "Woof Woof";
    }

    @Override
    public int getCageCleanliness() {
        return cageCleanliness;
    }
    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void cleanArea() {
        if (getCageCleanliness()+3 > 10) {
            cageCleanliness = 10;
        } else {
            cageCleanliness += 3;
        }
    }
    @Override
    public void walkPet() {
        updateBoredom(3);
        updatePottyLevel(-1);
    }

    @Override
    public void displayStats() {
        System.out.println();
        System.out.println(getName() + " " + getNoise() + " status:");
        System.out.println("Age: " + getAge());
        displayHunger();
        displayThirst();
        displayBoredom();
        displayPottyLevel();
        displayAreaCleanliness();
    }

    @Override
    public boolean isDead() {
        if (getHungerLevel() < 1) {
            return true;
        }
        return getThirstLevel() < 1;
    }

    public void displayHunger() {
        int count = 0;
        System.out.print(ANSI_PURPLE + "Hunger: " + ANSI_RESET);
        for (int i = 0; i < getHungerLevel(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getHungerLevel()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getHungerLevel() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    public void displayThirst() {
        int count = 0;
        System.out.print(ANSI_BLUE + "Thirst: " + ANSI_RESET);
        for (int i = 0; i < getThirstLevel(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getThirstLevel()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }if (getThirstLevel() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    public void displayBoredom() {
        int count = 0;
        System.out.print(ANSI_PURPLE + "Boredom: " + ANSI_RESET);
        for (int i = 0; i < getBoredomLevel(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getBoredomLevel()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getBoredomLevel() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    public void displayPottyLevel() {
        int count = 0;
        System.out.print(ANSI_BLUE + "Potty Level: " + ANSI_RESET);
        for (int i = 0; i < getNeedsPottyLevel(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getNeedsPottyLevel()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getNeedsPottyLevel() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    public void displayAreaCleanliness() {
        int count = 0;
        System.out.print(ANSI_PURPLE + "Area Cleanliness: " + ANSI_RESET);
        for (int i = 0; i < getCageCleanliness(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getCageCleanliness()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getCageCleanliness() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }

    @Override
    public void tick() {
        if (cageCleanliness - 1 < 1) {
            cageCleanliness = 0;
        } else {
            cageCleanliness--;
        }
        updateHungerLevel(-1);
        updateThirstLevel(-1);
        updatePottyLevel(-1);
        updateBoredom(-1);
    }

    // Text Colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
}
