package se.lexicon;

/**
 * The NameRepository class provides methods to manage a list of names.
 * It offers functionalities such as adding, removing, finding, and updating names.
 */
public class NameRepository {

    private static String[] names = new String[0];

    /**
     * Retrieves the current size of the names array.
     *
     * @return The number of elements in the names array.
     */
    public static int getSize() {
        // PART 1: implement getSize method
        return names.length;
    }

    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param newNames The array of names to set.
     */
    public static void setNames(String[] newNames) {
        // PART 1: implement setNames method
        names = newNames;
    }

    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {
        // PART 1: implement clear method
        names = new String[0];
    }

    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {
        // PART 1: implement findAll method
        return names.clone();
    }

    // TO DO,  (PART 2, PART 3, PART 4) Will be done soon.
}