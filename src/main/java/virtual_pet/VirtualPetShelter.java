package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
    ArrayList<VirtualPet> petShelter = new ArrayList<>();

    public VirtualPetShelter() {}

    public void addPet(VirtualPet newPet) {
        petShelter.add(newPet);
    }
    public void removePet(String petName) {
        petShelter.removeIf(pet -> pet.getName().equals(petName));
    }
    public void displayStatus() {
        for (VirtualPet pet : petShelter) {
            pet.displayStats();
        }
    }

    public void giveAllPetsFood() {
        for (VirtualPet pet : petShelter) {
            pet.feedPet();
        }
    }
    public void giveAllPetsWater() {
        for (VirtualPet pet : petShelter) {
            pet.waterPet();
        }
    }
    public void giveAllPetsOil() {
        for (VirtualPet pet: petShelter) {
            pet.oilPet();
        }
    }
    public void maintainAllPets() {
        for (VirtualPet pet : petShelter) {
            pet.maintainPet();
        }
    }
    public void playWithAllPets() {
        for (VirtualPet pet : petShelter) {
            pet.playWithPet();
        }
    }
    public void walkAllPets() {
        for (VirtualPet pet : petShelter) {
            pet.walkPet();
        }
    }
    public void cleanAllPetAreas() {
        for (VirtualPet pet : petShelter) {
            pet.cleanArea();
        }
    }



}
