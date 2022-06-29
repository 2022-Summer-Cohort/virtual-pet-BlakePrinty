package virtual_pet;

import java.util.Random;

public class OrganicCat extends OrganicPet {
    private int litterBoxCleanliness;
    private String noise;

    public OrganicCat(String name, int age) {
        super(name, age);
        this.litterBoxCleanliness = rand.nextInt(10);
        this.noise = "Meow Meow";
    }

    @Override
    public int getLitterBoxCleanliness() {
        return litterBoxCleanliness;
    }
    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void cleanArea() {
        if (getLitterBoxCleanliness()+3 > 10) {
            litterBoxCleanliness = 10;
        } else {
            litterBoxCleanliness += 3;
        }
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
        for (int i = 0; i < getLitterBoxCleanliness(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getLitterBoxCleanliness()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getLitterBoxCleanliness() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    @Override
    public void tick() {
        if (litterBoxCleanliness - 1 < 1) {
            litterBoxCleanliness = 0;
        } else {
            litterBoxCleanliness--;
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
