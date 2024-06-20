package se.lexicon;

public class App {
    public static void main(String[] args) {
        // Test getSize() with initial empty array
        int size = NameRepository.getSize();
        System.out.println("Initial size: " + size); // Expected output: 0

        // Test setNames() & getSize()
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan", "John Doe"});
        size = NameRepository.getSize();
        System.out.println("Size after setting names: " + size); // Expected output: 3

        // Test findAll()
        String[] allNames = NameRepository.findAll();
        System.out.println("All names: " + String.join(", ", allNames)); // Expected output: Erik Svensson, Mehrdad Javan, John Doe

        // Test clear() & getSize()
        NameRepository.clear();
        size = NameRepository.getSize();
        System.out.println("Size after clearing names: " + size);

        // Test add() & find()
        boolean added = NameRepository.add("Erik Svensson");
        System.out.println("Added Erik Svensson: " + added);
        added = NameRepository.add("Mehrdad Javan");
        System.out.println("Added Mehrdad Javan: " + added);
        added = NameRepository.add("Erik Svensson");
        System.out.println("Added Erik Svensson again: " + added);

        String found = NameRepository.find("Erik Svensson");
        System.out.println("Found Erik Svensson: " + found); //
        found = NameRepository.find("Unknown Name");
        System.out.println("Found Unknown Name: " + found);

        // Test findByFirstName()
        String[] firstNameMatches = NameRepository.findByFirstName("Erik");
        System.out.println("First name matches for 'Erik': " + String.join(", ", firstNameMatches));

        // Test findByLastName()
        String[] lastNameMatches = NameRepository.findByLastName("Javan");
        System.out.println("Last name matches for 'Javan': " + String.join(", ", lastNameMatches));

        // Test update()
        boolean updated = NameRepository.update("Erik Svensson", "Erik Johnson");
        System.out.println("Updated Erik Svensson to Erik Johnson: " + updated);
        updated = NameRepository.update("Erik Svensson", "Erik Johnson");
        System.out.println("Updated Erik Svensson to Erik Johnson again: " + updated);
        updated = NameRepository.update("Unknown Name", "Erik Johnson");
        System.out.println("Updated Unknown Name to Erik Johnson: " + updated);
    }
}
