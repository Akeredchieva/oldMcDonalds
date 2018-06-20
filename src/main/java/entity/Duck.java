package entity;

/**
 * Class duck which extends Animal and take it's functionality.
 */
public class Duck extends Animal{

    /**
     * Constants properties for  the name of the animal and it's sound
     */
    private static final String NAME = "Duck";
    private static final String SOUND = "Quack";


    /**
     * Constructor without input parameters to set the name and the sound of the animal.
     */
    public Duck() {
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
