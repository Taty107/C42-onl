package homework14;

import java.util.Scanner;

public class AnalysisDocuments {
    public static void main(String[] args) {
        System.out.println(" ");
        String inputFilePath = new Scanner(System.in).nextLine().trim();

    }

    private static String getInvalidNum(String docNum) {
        if (docNum.length() != 15) {
            return "Length document number is not equal to 15 characters";
        }
        if (!docNum.startsWith("docnum")) {
            return "String does not start with (docnum)";
        }
        if (!docNum.matches("[a-zA-Z0-9]+")) {
            return "String contains special characters";
        }
        return null;
    }
}
