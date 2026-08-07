package homework_15;

import java.util.ArrayList;
import java.util.List;

public class Animals {
    private final ArrayList<String> animals = new ArrayList<>(List.of("Lion", "Cat", "Dog", "Tiger"));

    public void addedAnimal(String animal) {
        animals.addFirst(animal);
    }

    public void deleteAnimal() {
        animals.removeLast();
    }

    @Override
    public String toString() {
        return String.valueOf(animals);
    }
}
