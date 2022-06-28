package virtual_pet;

public class OrganicDog extends OrganicPet {
    private int cageCleanliness;
    private String noise;

    public OrganicDog(String name, int age) {
        super(name, age);
        this.cageCleanliness = 10;
        this.noise = "Woof Woof";
    }

    @Override
    public int getCageCleanliness() {
        return cageCleanliness;
    }
    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void cleanArea() {
        if (getCageCleanliness()+2 > 10) {
            cageCleanliness = 10;
        } else {
            cageCleanliness += 2;
        }
    }
    @Override
    public void walkPet() {
        updatePottyLevel(2);
    }
}
