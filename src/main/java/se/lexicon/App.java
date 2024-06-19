package se.lexicon;

public class App {
    public static void main(String[] args) {
        // Test getSize() with initial empty array
        int size = NameRepository.getSize();
        System.out.println("Initial size: " + size);

        // Test setNames() and getSize()
        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        size = NameRepository.getSize();
        System.out.println("Size after setting names: " + size);

        // Test findAll()
        String[] allNames = NameRepository.findAll();
        System.out.println("All names: " + String.join(", ", allNames));

        // Test clear() and getSize()
        NameRepository.clear();
        size = NameRepository.getSize();
        System.out.println("Size after clearing names: " + size);

        // Test add() and find()
        boolean added = NameRepository.add("Erik Svensson");
        System.out.println("Added Erik Svensson: " + added);
        added = NameRepository.add("Mehrdad Javan");
        System.out.println("Added Mehrdad Javan: " + added);
        added = NameRepository.add("Erik Svensson");
        System.out.println("Added Erik Svensson again: " + added);

        String found = NameRepository.find("Erik Svensson");
        System.out.println("Found Erik Svensson: " + found);
        found = NameRepository.find("Unknown Name");
        System.out.println("Found Unknown Name: " + found);
    }
}
