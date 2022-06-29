package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RoboticPetTest {
    @Test
    public void petsHaveOil() {
        RoboticCat underTest = new RoboticCat("underTest", 1);
        assertTrue(underTest.getOilLevel() >= 0);
    }
    @Test
    public void petsHaveMaintenance() {
        RoboticCat underTest = new RoboticCat("underTest", 1);
        assertTrue(underTest.getMaintenanceLevel() >= 0);
    }
    @Test
    public void oilingIncreasesOilLevel() {
        RoboticCat underTest = new RoboticCat("underTest", 1);
        underTest.updateOilLevel(-5);
        int startingOilLevel = underTest.getOilLevel();
        underTest.oilPet();
        int newOilLevel = underTest.getOilLevel();
        assertTrue(newOilLevel > startingOilLevel);
    }
}
