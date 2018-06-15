package entity;

/**
 * Abstract class with one parameter the name of the Animal.
 * @author Ana Keredchieva
 * @since 15.06.2018
 */
abstract public class Animal {

    // The name of the animal
    private String name;

    /**
     * Base constructor of the class which set the name of the animal
     * @param name the input name of the animal
     */
    protected Animal(String name) {
        this.setName(name);
    }

    /**
     * Setter for the name of the animal from the input parameter
     * @param name the input name of the animal
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for the name of the animal.
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Abstract method for the functionality to make sound.
     * @return the string value of the sound that the animal makes.
     */
    abstract public String makeSound();
}
