package virtual_pet;

public class VirtualPet {
    private String petName;
    private int hungerLevel;
    private int staminaLevel;
    private int thirstLevel;

    public VirtualPet(String petName, int hungerLevel, int staminaLevel, int thirstLevel) {
        this.petName = petName;
        this.hungerLevel = hungerLevel;
        this.staminaLevel = staminaLevel;
        this.thirstLevel = thirstLevel;
    }

    // Get methods
    public String getName() {
        return petName;
    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public int getStaminaLevel() {
        return staminaLevel;
    }
    public int getThirstLevel() {
        return thirstLevel;
    }

    // Update methods
    public void updateHunger(int hungerChange) {
        hungerLevel += hungerChange;
    }
    public void updateStamina(int staminaChange) {
        staminaLevel += staminaChange;
    }
    public void updateThirst(int thirstChange) {
        thirstLevel += thirstChange;
    }

    // Actions to do to the pet
    public void givePetFood() {
        updateHunger(10);
        System.out.println("You gave " + getName() + " some food.");
    }
    public void givePetRest() {
        updateStamina(10);
        System.out.println("You gave " + getName() + " a rest.");
    }
    public void givePetWater() {
        updateThirst(10);
        System.out.println("You gave " + getName() + " some water.");
    }
    public void playWithPet() {
        updateHunger(-20);
        updateStamina(-20);
        updateThirst(-20);

        System.out.println("You threw the ball for " + getName());
        System.out.println(getName() + " brought the ball back for you!");
    }

    public void tick() {
        if (getHungerLevel() <= 50) {
            System.out.println(getName() + " seems to be hungry...");
            System.out.println("Maybe you should give them some food.");
        }
        if (getStaminaLevel() <= 50) {
            System.out.println(getName() + " seems to be getting tired...");
            System.out.println("Maybe you should give them a little break.");
        }
        if (getThirstLevel() <= 50) {
            System.out.println(getName() + " seems to be thirsty...");
            System.out.println("Maybe you should give them some water.");
        }

        if (getHungerLevel() > 50 && getStaminaLevel() > 50 && getThirstLevel() > 50) {
            System.out.println(getName() + " is eager to play!");
        }
    }
}
