import entity.Animal;
import entity.Cow;
import entity.Dog;
import entity.Duck;

/**
 * Class with the lyrics of the song.
 * @author Ana Keredchieva
 * @since 15.06.2018
 */
public class OldMcDonald {

    private Animal[] animals;

    /**
     * Basic constructor without input parameters. It set the values of the array and the set the capacity.
     */
    public OldMcDonald() {
        animals = new Animal[]{new Cow(), new Dog(), new Duck()};
    }

    /**
     * Method which create the lyrics of the song.
     */
    public void sing() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(
                    "Old McDonald had a farm, E-I-E-I-O\n" +
                     "And on his farm he had a " + animals[i].getName() + " E-I-E-I-O\n" +
                     "With a " + animals[i].makeSound() + " " + animals[i].makeSound() + " here\n" +
                     "and a " + animals[i].makeSound() + " " + animals[i].makeSound() + " there\n"
            );
        }
    }

    /**
     * The entry point of the application.
     */
    public static void main(String[] args) {
        OldMcDonald oldMcDonald = new OldMcDonald();
        oldMcDonald.sing();
    }
}
