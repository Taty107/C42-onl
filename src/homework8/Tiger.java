package homework8;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("The tiger roars.");
    }

    @Override
    public void eat(String food) {
        if (food.equalsIgnoreCase("meat")) {
            System.out.println("The tiger loves to eat meat.");
        } else {
            System.out.println("The tiger is not happy.");
        }
    }
}
