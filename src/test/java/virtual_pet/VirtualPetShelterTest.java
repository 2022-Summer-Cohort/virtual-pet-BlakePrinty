package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetShelterTest {
    @Test
    public void ableToAddPet() {
        VirtualPet underTest = new OrganicDog("test", 1);
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.addPet(underTest);
        assertEquals(1, underTestShelter.petShelter.size());
    }
    @Test
    public void ableToRemovePet() {
        VirtualPet underTest = new OrganicDog("test", 1);
        VirtualPet underTestPet2 = new OrganicCat("superTest", 10);
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.addPet(underTest);
        underTestShelter.addPet(underTestPet2);
        underTestShelter.removePet(underTestPet2.getName());

        assertEquals(1, underTestShelter.petShelter.size());
    }
    @Test
    public void cleanAllPetAreasIncreasesCleanliness() {
        VirtualPet underTest = new OrganicDog("test", 1);
        VirtualPetShelter underTestShelter = new VirtualPetShelter();
        underTestShelter.addPet(underTest);
        int start = underTest.getCageCleanliness();
        underTestShelter.cleanAllPetAreas();
        int end = underTest.getCageCleanliness();
        assertTrue(end > start);
    }
}
