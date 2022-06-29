package virtual_pet;

public class RoboticCat extends RoboticPet {
    private int litterBoxCleanliness;
    private String noise;

    public RoboticCat(String name, int age) {
        super(name, age);
        this.litterBoxCleanliness = rand.nextInt(10);
        this.noise = "Beep Meow";
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
    public void walkPet() {
        updateOilLevel(-1);
        updateMaintenanceLevel(-1);
        updateGlitchProbability(3);
    }

    @Override
    public void displayStats() {
        System.out.println();
        System.out.println(getName() + " " + getNoise() + " status:");
        System.out.println("Age: " + getAge());
        displayOilLevel();
        displayMaintenanceLevel();
        displayGlitchProbability();
        displayAreaCleanliness();
    }

    public void displayOilLevel() {
        int count = 0;
        System.out.print(ANSI_YELLOW + "Oil: " + ANSI_RESET);
        for (int i = 0; i < getOilLevel(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getOilLevel()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getOilLevel() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    public void displayMaintenanceLevel() {
        int count = 0;
        System.out.print(ANSI_CYAN + "Maintenance: " + ANSI_RESET);
        for (int i = 0; i < getMaintenanceLevel(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getMaintenanceLevel()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getMaintenanceLevel() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    public void displayGlitchProbability() {
        int count = 0;
        System.out.print(ANSI_YELLOW + "Glitch Probability: " + ANSI_RESET);
        for (int i = 0; i < getGlitchProbability(); i++) {
            System.out.print(ANSI_GREEN + "♥" + ANSI_RESET);
            count++;
            if (i == getGlitchProbability()-1) {
                while (count != 10) {
                    System.out.print(ANSI_RED + "♥" + ANSI_RESET);
                    count++;
                }
            }
        }
        if (getGlitchProbability() < 1) {
            System.out.print(ANSI_RED + "♥♥♥♥♥♥♥♥♥♥" + ANSI_RESET);
        }
        System.out.println();
    }
    public void displayAreaCleanliness() {
        int count = 0;
        System.out.print(ANSI_CYAN + "Area Cleanliness: " + ANSI_RESET);
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
        updateOilLevel(-1);
        updateGlitchProbability(-1);
        updateMaintenanceLevel(-1);
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
