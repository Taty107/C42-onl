package homework8;

public class MyMain {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tiger tiger = new Tiger();
        Dog dog = new Bulldog();

        System.out.println("~".repeat(60));
        rabbit.eat("grass");
        rabbit.voice();
        System.out.println("~".repeat(60));
        dog.eat("meat");
        dog.voice();
        System.out.println("~".repeat(60));
        tiger.eat("meat");
        tiger.voice();
        System.out.println("~".repeat(60));
    }
}
