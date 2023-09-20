package petregistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnimalRegistry {
    private static Map<String, Animal> animals;

    public AnimalRegistry() {
        animals = new HashMap<>();
    }

    public void addAnimal(Animal animal) {
        animals.put(animal.name, animal);
    }

    public static void main(String[] args) {
        try (Counter counter = new Counter(); Scanner scanner = new Scanner(System.in)) {
            AnimalRegistry registry = new AnimalRegistry();
            boolean exit = false;

            while (!exit) {
                System.out.println("1. Add new animal");
                System.out.println("2. Show animal commands");
                System.out.println("3. Teach new command");
                System.out.println("4. Display animal info");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter animal name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter animal type (Dog/Cat): ");
                        String type = scanner.nextLine();
                        Animal animal;
                        if (type.equalsIgnoreCase("Dog")) {
                            animal = new Dog(name);
                        } else if (type.equalsIgnoreCase("Cat")) {
                            animal = new Cat(name);
                        } else {
                            System.out.println("Invalid animal type.");
                            continue;
                        }
                        registry.addAnimal(animal);
                        counter.add();
                        System.out.println("Animal added successfully.");
                        break;
                    case 2:
                        System.out.print("Enter animal name: ");
                        String animalName = scanner.nextLine();
                        Animal selectedAnimal = animals.get(animalName);
                        if (selectedAnimal != null) {
                            selectedAnimal.showCommands();
                        } else {
                            System.out.println("Animal not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter animal name: ");
                        String animalName2 = scanner.nextLine();
                        Animal selectedAnimal2 = animals.get(animalName2);
                        if (selectedAnimal2 != null) {
                            System.out.print("Enter new command to teach: ");
                            String command = scanner.nextLine();
                            selectedAnimal2.teachCommand(command);
                        } else {
                            System.out.println("Animal not found.");
                        }
                        break;
                    case 4:
                        System.out.print("Enter animal name: ");
                        String animalName3 = scanner.nextLine();
                        Animal selectedAnimal3 = animals.get(animalName3);
                        if (selectedAnimal3 != null) {
                            selectedAnimal3.displayInfo();
                        } else {
                            System.out.println("Animal not found.");
                        }
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
