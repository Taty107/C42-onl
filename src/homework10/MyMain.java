package homework10;

public class MyMain {
    public static void main(String[] args){
        System.out.println("Task 1");
        createUser();
        System.out.println("~".repeat(60));
        System.out.println("Task 2");
        //cloneUser();
    }

    public static void createUser(){
        User user1 = new User("Anna", "Hilko", 23, 11111111);
        User user2 = new User("Anna", "Hilko", 23, 11111111);
        User user3 = new User("Ivan", "Ivanov", 35, 12121212);
        System.out.println(user1);
        System.out.println("Compare user1 and user2: " + user1.equals(user2));
        System.out.println("Compare user1 and user3: " + user1.equals(user3));
        System.out.println("User hashcode is: " + user1.hashCode());
    }

    public static void cloneUser(){

    }
}
