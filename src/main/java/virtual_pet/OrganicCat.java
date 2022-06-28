package virtual_pet;

public class OrganicCat extends OrganicPet {
    private int litterBoxCleanliness;
    private String noise;

    public OrganicCat(String name, int age) {
        super(name, age);
        this.litterBoxCleanliness = 10;
        this.noise = "Meow Meow";
    }

    @Override
    public int getLitterBoxCleanliness() {
        return litterBoxCleanliness;
    }
    @Override
    public String getNoise() {
        return noise;
    }


}
