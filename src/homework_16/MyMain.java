package homework_16;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("~".repeat(70));
        System.out.println("Task 1");
        String[] inputChar = {"a", "g", "j", "a", "m", "g", "M"};
        System.out.println(wordMultiple(inputChar));
        System.out.println("~".repeat(70));
        System.out.println("Task 2");
        String[] inputWords = {"man", "moon", "good", "night"};
        System.out.println(pairs(inputWords));
        System.out.println("~".repeat(70));
        System.out.println("Task*");
        String example1 = "([{{[(())]}}])";
        String example2 = "{{[]()}}}}";
        System.out.println("This line is balanced? " + example1 + "\t" + isBalanced(example1));
        System.out.println("This line is balanced? " + example2 + "\t" + isBalanced(example2));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings){
        Map<String, Boolean> result = new HashMap<>();
        for (String string : strings) {
            result.put(string, result.containsKey(string));
        }
        return result;
    }

    public static Map<String, String> pairs(String[] strings){
        Map<String, String> result = new HashMap<>();
        for (String string : strings){
            String first = string.substring(0, 1);
            String last = string.substring(string.length() -1);
            result.put(first, last);
        }
        return result;
    }

    public static boolean isBalanced(String string){
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : string.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
