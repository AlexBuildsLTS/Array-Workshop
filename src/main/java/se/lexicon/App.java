package se.lexicon;


public class App {
    public static void main(String[] args) {

        int size = NameRepository.getSize();
        System.out.println("Initial size: " + size);

        NameRepository.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        size = NameRepository.getSize();
        System.out.println("Size after setting names: " + size);


        String[] allNames = NameRepository.findAll();
        System.out.println("All names: " + String.join(", ", allNames)); // Expected output: Erik Svensson, Mehrdad Javan


    }
}
