package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OrganicPetTest {
    @Test
    public void petsHaveHungerLevels() {
        OrganicDog underTest = new OrganicDog("underTest", 1);
        assertTrue(underTest.getHungerLevel() >= 0);
    }
    @Test
    public void petsHaveThirst() {
        OrganicDog underTest = new OrganicDog("underTest", 1);
        assertTrue(underTest.getThirstLevel() >= 0);
    }
    @Test
    public void feedingIncreasesHunger() {
        OrganicDog underTest = new OrganicDog("underTest", 1);
        underTest.updateHungerLevel(-5);
        int startingHungerLevel = underTest.getHungerLevel();
        underTest.feedPet();
        int newHungerLevel = underTest.getHungerLevel();
        assertTrue(newHungerLevel > startingHungerLevel);
    }
}
