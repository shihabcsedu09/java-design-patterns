package creational.builder.product;

/**
 * House is the product class for the Builder pattern.
 */
public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }
    public void setStructure(String structure) {
        this.structure = structure;
    }
    public void setRoof(String roof) {
        this.roof = roof;
    }
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House with " + foundation + ", " + structure + ", " + roof + ", and " + interior;
    }
}