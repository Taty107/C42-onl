package homework13;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Task 1");
        checkValues();
        System.out.println("~".repeat(70));
        System.out.println("Task*");
        getImpossibleFinally();
    }

    public static void checkValues() {
        User user = new User("kapusha", "taty1", "taty1");
        User user1 = new User("Kapusha 1", "112112furfur", "111222rufruf");
        System.out.println("Are the values user entered correctly?");
        User.isValuesCorrect(user.getLogin(), user.getPassword(), user.getConfirmPassword());
        System.out.println("Are the values user1 entered correctly?");
        User.isValuesCorrect(user1.getLogin(), user1.getPassword(), user1.getConfirmPassword());
    }

    public static void getImpossibleFinally() {
        //Метод System.exit(0) полностью остановит работу программы
        try {
            System.out.println("This code will be executed");
            System.exit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This code will not execute");
        }
        // Если в блоке try будет бесконечный цикл
        try {
            while (true) {
                System.out.println("This code will be executed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This code will not execute");
        }
    }

}
