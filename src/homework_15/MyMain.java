package homework_15;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Task 1");
        getNumbersWithoutDuplicates();
        System.out.println("~".repeat(70));

        System.out.println("Task 2");
        Animals animals = new Animals();
        System.out.println("Original list of animals: " + animals);
        animals.addedAnimal("Rabbit");
        System.out.println("List after adding animals: " + animals);
        animals.addedAnimal("Dolphin");
        System.out.println("List after adding animals: " + animals);
        animals.deleteAnimal();
        System.out.println("List after delete animals: " + animals);
        System.out.println("~".repeat(70));

        System.out.println("Task 3");
        StudentService service = new StudentService();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter Karpov", "IO-11", 1, Arrays.asList(5, 4, 4, 5)));
        students.add(new Student("Igor Karpov", "IO-11", 1, Arrays.asList(5, 5, 5, 5)));
        students.add(new Student("Ivan Ivanov", "IO-21", 2, Arrays.asList(3, 3, 5, 4)));
        students.add(new Student("Ivan Sidorov", "IO-21", 2, Arrays.asList(3, 3, 2, 2)));
        System.out.println("List of students before processing");
        service.printStudents(students, 1);
        service.printStudents(students, 2);
        service.processStudents(students);
        System.out.println("\n" + "List of students after processing");
        service.printStudents(students, 1);
        service.printStudents(students, 2);
        service.printStudents(students, 3);
        System.out.println("~".repeat(70));

        System.out.println("Task*");

        MyCollection<String> name = new MyCollection<>();
        name.addElement("Artyom");
        name.addElement("Vitalina");
        System.out.println(name);
        System.out.println(name.getElement(1));
        name.deleteElement(1);
        System.out.println(name);
        System.out.println(name.containElement("Vova"));
        name.removeCollection();
        System.out.println(name);
        System.out.println("~".repeat(70));
    }

    public static void getNumbersWithoutDuplicates() {
        System.out.println("Pleas enter a set of integers: ");
        String inputNumbers = new Scanner(System.in).nextLine();

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(inputNumbers);

        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }

        System.out.println("Your set of integers: " + inputNumbers);
        System.out.println("Integers after processing: " + numbers);
    }
}
