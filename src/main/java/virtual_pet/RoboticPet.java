package virtual_pet;

import java.util.Random;

public abstract class RoboticPet extends VirtualPet {
    private int oilLevel;
    private int maintenanceLevel;
    private int glitchProbability;
    private boolean isGlitching;

    Random rand = new Random();

    public RoboticPet(String name, int age) {
        super(name, age);
        this.oilLevel = rand.nextInt(10);
        this.maintenanceLevel = rand.nextInt(10);
        this.glitchProbability = rand.nextInt(10);
        this.isGlitching = false;
    }

    @Override
    public int getOilLevel() {
        return oilLevel;
    }
    @Override
    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }
    @Override
    public int getGlitchProbability() {
        return glitchProbability;
    }
    public boolean isGlitching() {
        return isGlitching;
    }

    @Override
    public void oilPet() {
        if (getOilLevel()+3 > 10) {
            oilLevel = 10;
        } else {
            oilLevel += 3;
        }
    }
    @Override
    public void maintainPet() {
        if (getMaintenanceLevel()+3 > 10) {
            maintenanceLevel = 10;
        } else {
            maintenanceLevel += 3;
        }
    }
    @Override
    public void playWithPet() {
        if (getGlitchProbability()+3 > 10) {
            glitchProbability = 10;
        } else {
            glitchProbability += 3;
        }
    }

    public void updateOilLevel(int change) {
        if (oilLevel+change < 1) {
            oilLevel = 0;
        } else {
            oilLevel += change;
        }

    }
    public void updateMaintenanceLevel(int change) {
        if (maintenanceLevel+change < 1) {
            maintenanceLevel = 0;
        } else {
            maintenanceLevel += change;
        }
    }
    public void updateGlitchProbability(int change) {
        if (glitchProbability+change < 1) {
            glitchProbability = 0;
        } else {
            glitchProbability += change;
        }
    }
}
