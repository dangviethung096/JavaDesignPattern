package hungdv39.test.additional.simple_factory;

import java.util.Scanner;

public class  SimpleFactory {
    public Animal createAnimal() {
        Animal intendedAnimal = null;
        System.out.print("0 for Dog, 1 for Tiger: ");
        Scanner input = new Scanner(System.in);
        // Get choice
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("You have entered: " + choice);

        switch (choice) {
            case 0 -> intendedAnimal = new Dog();
            case 1 -> intendedAnimal = new Tiger();
            default -> {
                System.out.println("You must enter either 0 or 1");
                throw new IllegalArgumentException("Unknown animal");
            }
        }

        return intendedAnimal;
    }
}
