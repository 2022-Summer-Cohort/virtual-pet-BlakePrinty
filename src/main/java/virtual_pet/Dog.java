package virtual_pet;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private int hunger;
    private int happiness;
    private boolean tired;

    public Dog(String name, String breed, int age, int hunger, int happiness, boolean tired) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.hunger = hunger;
        this.happiness = happiness;
        this.tired = tired;
    }

    // Get Methods
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
    public int getHunger() {
        return hunger;
    }
    public int getHappiness() {
        return happiness;
    }
    public boolean getIsTired() {
        return tired;
    }

    // Update functions
    public void updateHunger(int hungerChange) {
        hunger += hungerChange;
    }
    public void updateHappiness(int happinessChange) {
        happiness += happinessChange;
    }
    public void updateTired(boolean isTired) {
        tired = isTired;
    }

    // Play method
    public void playFetch() {
        System.out.println("You threw the ball!");
        System.out.println(getName() + " ran after the ball and brought it back to you!");

        // Update the dogs stats
        updateHappiness(20);
        updateHunger(-20);
        if (getHappiness() <= 20 || getHunger() <= 20) {
            updateTired(true);
        }

        displayDogStats(); // Show the dogs stats to determine whether they can keep going
    }

    // Feed method
    public void feedPet() {
        updateHunger(20);
        updateHappiness(10);

        displayDogStats(); // Show the dogs stats to determine whether they can keep going
    }

    // Display method
    public void displayDogStats() {
        System.out.println("Hunger: " + getHunger());
        System.out.println("Happiness: " + getHappiness());
        System.out.println("Tired: " + getIsTired());
    }

    public void tick() {
        // passage of time
    }
}
