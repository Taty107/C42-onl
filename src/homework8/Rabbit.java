package homework8;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("The rabbit snorts.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("grass")) {
            System.out.println("The rabbit loves to eat grass.");
        } else {
            System.out.println("The rabbit is not happy.");
        }
    }
}
