package virtual_pet;

public abstract class OrganicPet extends VirtualPet {
    private int hungerLevel;
    private int thirstLevel;
    private int boredomLevel;
    private int needsPottyLevel;
    private boolean isBored;

    public OrganicPet(String name, int age) {
        super(name, age);
        this.hungerLevel = 10;
        this.thirstLevel = 10;
        this.boredomLevel = 0;
        this.needsPottyLevel = 0;
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
        if (getHungerLevel()+2 > 10) {
            hungerLevel = 10;
        } else {
            hungerLevel += 2;
        }
    }
    @Override
    public void waterPet() {
        if (getThirstLevel()+2 > 10) {
            thirstLevel = 10;
        } else {
            thirstLevel += 2;
        }
    }
    public void updatePottyLevel(int change) {
        needsPottyLevel += change;
    }
}
