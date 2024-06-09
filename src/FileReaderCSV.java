import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderCSV {
    static String path_1 = "MCQ/MCQ_1.csv";
    static String path_2 = "MCQ/MCQ_2.csv";
    BufferedReader reader = null;
    public void startTest(String fileName) {
        Scanner answer = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String output = "";
            System.out.println("\nPlease answer this question..");
            while ((output = reader.readLine()) != null) {
                String[] data = output.split(",");
                System.out.printf("%s", data[1]);
                System.out.println();
                System.out.printf("   A.%s \n   B.%s \n   C.%s \n   D.%s", data[2], data[3], data[4], data[5], data[6], data[7]);
                System.out.println("\n");
                answer = new Scanner(System.in);
                System.out.print("Your answer: ");
                String getAnswer = answer.nextLine();
                if (getAnswer.equalsIgnoreCase(data[6])) {
                    Student.score += 10;
                    Student.correct++;
                    System.out.println();
                } else {
                    System.out.println("Wrong Answer. The Correct Answer is " + data[6] + ". " + data[7]);
                    Student.wrong++;
                    System.out.println();
                }
                Student.question++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


