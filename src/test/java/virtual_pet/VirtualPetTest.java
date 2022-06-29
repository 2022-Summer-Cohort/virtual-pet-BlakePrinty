package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class VirtualPetTest {
    @Test
    public void getNameShouldReturnName() {
        VirtualPet underTest = new OrganicDog("test", 1);
        assertEquals("test", underTest.getName());
    }
    @Test
    public void getAgeShouldReturnAge() {
        VirtualPet underTest = new OrganicDog("test", 15);
        assertEquals(12, underTest.getAge());
    }
    @Test
    public void isDeadIsFalse() {
        VirtualPet underTest = new OrganicDog("test", 15);
        assertFalse(underTest.isDead());
    }
}
