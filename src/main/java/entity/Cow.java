package entity;

/**
 * Class cow which extends Animal and take it's functionality.
 */
public class Cow extends Animal {

    /**
     * Constants properties for  the name of the animal and it's sound
     */
    private static final String NAME = "Cow";
    private static final String SOUND = "Moo";

    /**
     * Constructor without input parameters to set the name and the sound of the animal.
     */
    public Cow() {
        super(NAME, SOUND);
    }

    /**
     * Method from the parent which return the sound that the animal makes.
     * @return String with the value of the sound that the animal makes.
     */
    public String makeSound() {
        return this.getSound();
    }
}
