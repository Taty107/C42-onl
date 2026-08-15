package homework_18;

import java.util.*;
import java.util.stream.Collectors;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("~".repeat(70));
        System.out.println("Task 1");
        workWithStream();
        System.out.println("~".repeat(70));
        System.out.println("Task*");
        getReversedListNames();
    }

    public static void workWithStream() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,10));

        int sum = numbers.stream().distinct().filter(n -> n % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println("Original list: " + numbers);
        System.out.println("The sum of even unique elements: " + sum);
    }

    public static void getReversedListNames(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Bob");
        map.put(2, "Artyom");
        map.put(3, "Anna");
        map.put(8, "Alexander");

        Set<Integer> allowedIds = Set.of(1,2,5,8,9,13);
        List<String> result = map.entrySet().stream()
                .filter(entry -> allowedIds.contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
