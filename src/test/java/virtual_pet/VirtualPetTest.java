package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void shouldReturnMyla() {
        // Creates a new pet with the name Myla
        VirtualPet underTest = new VirtualPet("Myla", 100, 100, 100);

        String result = underTest.getName();

        assertEquals("Myla", result);
    }

    @Test
    public void shouldReturn90HungerLevel() {
        // Creates a new pet with a hunger level of 90
        VirtualPet underTest = new VirtualPet("Myla", 90, 100, 100);

        int result = underTest.getHungerLevel();

        assertEquals(90, result);
    }

    @Test
    public void shouldReturn50StaminaLevel() {
        // Creates a new pet with a hunger level of 90
        VirtualPet underTest = new VirtualPet("Myla", 100, 50, 100);

        int result = underTest.getStaminaLevel();

        assertEquals(50, result);
    }

    @Test
    public void shouldReturn200ThirstLevel() {
        // Creates a new pet with a hunger level of 90
        VirtualPet underTest = new VirtualPet("Myla", 100, 100, 200);

        int result = underTest.getStaminaLevel();

        assertEquals(200, result);
    }
}
