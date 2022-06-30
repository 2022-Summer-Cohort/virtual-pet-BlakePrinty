package virtual_pet;

import java.util.Random;

public abstract class OrganicPet extends VirtualPet {
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int needsPottyLevel;
    private boolean isBored;

    Random rand = new Random();

    public OrganicPet(String name, int age) {
        super(name, age);
        this.hungerLevel = rand.nextInt(10);
        this.thirstLevel = rand.nextInt(10);
        this.boredomLevel = rand.nextInt(10);
        this.needsPottyLevel = rand.nextInt(10);
        this.isBored = false;
    }

    @Override
    public int getHungerLevel() {
        return hungerLevel;
    }
    @Override
    public int getThirstLevel() {
        return thirstLevel;
    }
    @Override
    public int getBoredomLevel() {
        return boredomLevel;
    }
    @Override
    public int getNeedsPottyLevel() {
        return needsPottyLevel;
    }
    public boolean isBored() {
        return isBored;
    }

    @Override
    public void feedPet() {
        if (getHungerLevel()+3 > 10) {
            hungerLevel = 10;
        } else {
            hungerLevel += 3;
        }
    }
    @Override
    public void waterPet() {
        if (getThirstLevel()+3 > 10) {
            thirstLevel = 10;
        } else {
            thirstLevel += 3;
        }
    }

    @Override
    public void playWithPet() {
        if (getBoredomLevel()+3 > 10) {
            boredomLevel = 10;
        } else {
            boredomLevel += 3;
        }
        if (getNeedsPottyLevel()+3 > 10) {
            needsPottyLevel = 10;
        } else {
            needsPottyLevel += 3;
        }
    }

    public void updatePottyLevel(int change) {
        if ( needsPottyLevel + change < 1) {
            needsPottyLevel = 0;
        }
        needsPottyLevel += change;
    }
    public void updateHungerLevel(int change) {
        if ( hungerLevel + change < 1) {
            hungerLevel = 0;
        }
        hungerLevel += change;
    }
    public void updateThirstLevel(int change) {
        if ( thirstLevel + change < 1) {
            thirstLevel = 0;
        }
        thirstLevel += change;
    }
    public void updateBoredom(int change) {
        if ( boredomLevel + change < 1) {
            boredomLevel = 0;
        }
        boredomLevel += change;
    }
}
