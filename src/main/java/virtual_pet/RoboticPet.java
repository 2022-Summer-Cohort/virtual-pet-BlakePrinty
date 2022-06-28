package virtual_pet;

public abstract class RoboticPet extends VirtualPet {
    private int oilLevel;
    private int maintenanceLevel;
    private int glitchProbability;
    private boolean isGlitching;

    public RoboticPet(String name, int age) {
        super(name, age);
        this.oilLevel = 10;
        this.maintenanceLevel = 10;
        this.glitchProbability = 0;
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
        if (getOilLevel()+2 > 10) {
            oilLevel = 10;
        } else {
            oilLevel += 2;
        }
    }
    @Override
    public void maintainPet() {
        if (getMaintenanceLevel()+2 > 10) {
            maintenanceLevel = 10;
        } else {
            maintenanceLevel += 2;
        }
    }
}
