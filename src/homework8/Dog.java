package homework8;

public abstract class Dog extends Animal {

    @Override
    public void voice() {
        System.out.println("The dog is barking.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("meat")) {
            System.out.println("The dog loves to eat meat.");
        } else {
            System.out.println("The dog is not happy.");
        }
    }
}
