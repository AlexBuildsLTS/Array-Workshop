package se.lexicon;

import java.util.Arrays;
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
        return names.length;
    }

    /**
     * Sets the names array to the provided array of names & it should replace all existing names.
     *
     * @param newNames The array of names to set.
     */
    public static void setNames(String[] newNames) {
        names = newNames;
    }

    /**
     * Clears the names array by creating a new empty array.
     */
    public static void clear() {
        names = new String[0];
    }

    /**
     * Returns all names in a new array (Retrieves a copy of the names array).
     *
     * @return A new array containing all elements from the names array.
     */
    public static String[] findAll() {
        return names.clone();
    }

    /**
     * Finds a name that matches the given fullName case-insensitively.
     *
     * @param fullName The full name to search for.
     * @return The matching name if found; otherwise, null.
     */
    public static String find(String fullName) {
        for (String name : names) {
            if (name.equalsIgnoreCase(fullName)) {
                return name;
            }
        }
        return null;
    }

    /**
     * Adds a new fullName to the names array if it doesn't already exist.
     *
     * @param fullName The full name to add.
     * @return True if the fullName is added successfully; false if it already exists.
     */
    public static boolean add(String fullName) {
        if (find(fullName) != null) {
            return false;
        }
        String[] newNames = new String[names.length + 1];
        System.arraycopy(names, 0, newNames, 0, names.length);
        newNames[names.length] = fullName;
        names = newNames;
        return true;
    }
    /**
     * Finds all names that match the given firstName.
     *
     * @param firstName The first name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByFirstName(String firstName) {
        String[] results = new String[names.length];
        int count = 0;
        for (String name : names) {
            if (name.split(" ")[0].equalsIgnoreCase(firstName)) {
                results[count++] = name;
            }
        }
        return Arrays.copyOf(results, count);
    }

    /**
     * Finds all names that match the given lastName.
     *
     * @param lastName The last name to search for.
     * @return An array containing all matching names.
     */
    public static String[] findByLastName(String lastName) {
        String[] results = new String[names.length];
        int count = 0;
        for (String name : names) {
            if (name.split(" ")[1].equalsIgnoreCase(lastName)) {
                results[count++] = name;
            }
        }
        return Arrays.copyOf(results, count);
    }

    /**
     * Updates a name in the names array from the original name to the updated name.
     *
     * @param original    The original name to update.
     * @param updatedName The updated name to set.
     * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
     */
    public static boolean update(String original, String updatedName) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(original)) {
                if (find(updatedName) == null) {
                    names[i] = updatedName;
                    return true;
                } else {
                    return false; // Updated name exists
                }
            }
        }
        return false; // Original name not found
    }
    /**
     * Removes a name from the names array, case-insensitively.
     *
     * @param fullName The full name to remove.
     * @return True if the name is removed successfully; false if the name is not found in the array.
     */
    public static boolean remove(String fullName) {
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(fullName)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false; // Name could not be found
        }
        String[] newNames = new String[names.length - 1];
        System.arraycopy(names, 0, newNames, 0, index);
        System.arraycopy(names, index + 1, newNames, index, names.length - index - 1);
        names = newNames;
        return true;
    }
}