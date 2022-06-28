package virtual_pet;

import java.util.ArrayList;

public abstract class VirtualPet {
    private ArrayList<String> petNeeds;
    private String name;
    private int age;
    private boolean isDead;
    private int needsPottyLevel;
    private boolean needsPotty;

    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
        this.isDead = false;
        this.needsPottyLevel = 0;
        this.needsPotty = false;
        this.petNeeds = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isDead() {
        return isDead;
    }
    public int getNeedsPottyLevel() {
        return needsPottyLevel;
    }
    public boolean getNeedsPotty() {
        return needsPotty;
    }

    public void displayStats() {
        System.out.println(getName());
    }

    // Override Methods
    public void feedPet() {}
    public void waterPet() {}
    public void oilPet() {}
    public void cleanArea() {} // MAYBE NOT AN OVERRIDE
    public void maintainPet() {}
    public void walkPet() {} // ONLY FOR DOGS
    public void playWithPet() {}
    public void makeNoise() {}

    // Override Getters
    public int getHungerLevel() {
        return 0;
    }
    public int getThirstLevel() {
        return 0;
    }
    public int getBoredomLevel() {
        return 0;
    }
    public int getOilLevel() {
        return 0;
    }
    public int getMaintenanceLevel() {
        return 0;
    }
    public int getGlitchProbability() {
        return 0;
    }
    public int getCageCleanliness() {
        return 0;
    }
    public int getLitterBoxCleanliness() {
        return 0;
    }
    public String getNoise() {
        return "";
    }

}

