package homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Task 1");
        getAbbreviationsFromString();
        System.out.println("~".repeat(100));
        System.out.println("Task*");
        getInformationFromDocAndOutputIt();
        System.out.println("~".repeat(100));
    }

    public static void getAbbreviationsFromString() {
        System.out.println("Pleas enter the text and wi will check it for abbreviations.");
        String inputText = new Scanner(System.in).nextLine();

        Pattern pattern = Pattern.compile("(?U)\\b[A-ZА-ЯЁ]{2,6}\\b");
        Matcher match = pattern.matcher(inputText);

        boolean found = false;

        while (match.find()) {
            System.out.println(match.group());
            found = true;
        }
        if (!found) {
            System.out.println("Abbreviations is not found.");
        }
    }

    public static void getInformationFromDocAndOutputIt() {
        String text = "Hi! This is my Email for contact taty.student@gmail.com"
                + "\nMy documents 2354-1367-88, 9800-4456-00"
                + "\nIf anything happens, call me on the phone +(79)490934784, +(79)490934784, +(67)567290876";

        Pattern emailPattern = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
        Matcher emailMatcher = emailPattern.matcher(text);
        String foundEmails = "";
        while (emailMatcher.find()){
            String email = emailMatcher.group();
            if (!foundEmails.contains(email)) {
                System.out.println("Email: " + email);
                foundEmails += email + " ";
            }
        }

        Pattern docPattern = Pattern.compile("\\b\\d{4}-\\d{4}-\\d{2}\\b");
        Matcher docMatcher = docPattern.matcher(text);
        String foundDoc = "";
        while (docMatcher.find()){
            String doc = docMatcher.group();
            if (!foundDoc.contains(doc)) {
                System.out.println("Document number: " + docMatcher.group());
                foundDoc += doc + " ";
            }
        }

        Pattern phonePattern = Pattern.compile("\\+\\(\\d{2}\\)\\d{9}");
        Matcher phoneMatcher = phonePattern.matcher(text);
        String foundPhone = "";
        while (phoneMatcher.find()){
            String phone = phoneMatcher.group();
            if (!foundPhone.contains(phone)) {
                System.out.println("Phone number: " + phoneMatcher.group());
                foundPhone += phone + " ";
            }
        }

    }
}
