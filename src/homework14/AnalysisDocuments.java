package homework14;

import java.io.*;
import java.util.Scanner;

public class AnalysisDocuments {
    public static void main(String[] args) {
        System.out.print("Pleas enter path your document: "); // src/file_doc_num.txt
        String inputFilePath = new Scanner(System.in).nextLine().trim();
        File fileValidNum = new File("src/valid_doc_num.txt");
        File fileInvalidNum = new File("src/invalid_doc_num.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(fileValidNum));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(fileInvalidNum))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String docNum = line.trim();
                if (docNum.isEmpty()){
                    continue;
                }
                String invalidReason = getInvalidReason(docNum);
                if (invalidReason == null){
                    validWriter.write(docNum);
                    validWriter.newLine();
                } else {
                    invalidWriter.write(docNum + " " + invalidReason);
                    invalidWriter.newLine();
                }
            }
            System.out.println("~".repeat(70));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getInvalidReason(String docNum) {
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
