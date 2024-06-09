import java.util.Scanner;

public class Main {
    static Scanner sc = null;
    public static Student s;
    public static void main(String[] args) {
        fillYourName();
        selectYourMCQ();
        showResult();
    }

    private static void showResult() {
        int finalScore = Student.getScore();
        int correctanswer = Student.getCorrect();
        int wronganswer = Student.getWrong();
        int question = Student.getQuestion();
        String name = s.name;
        System.out.printf("%s, your answered %s Question Right, %s Question Wrong for a Total of %s Question\n",name, correctanswer, wronganswer, question);
        System.out.println("You scored " + finalScore + "%");
    }
    private static void selectYourMCQ() {
        StartTest test1 = new StartTest();
        test1.chooseTheTest();
        Scanner sc1 = new Scanner(System.in);
        int select = 0;
        System.out.print("\n Your choice: ");
        if (sc1.hasNextInt()) {
            select = sc1.nextInt();
        } else {
            sc1.close();
        }
        if (select == 1) {
            test1.startTest(FileReaderCSV.path_1);
            sc1.close();
        } else {
            test1.startTest(FileReaderCSV.path_2);
            sc1.close();
        }

    }
    public static void fillYourName() {
        sc = new Scanner(System.in);
        System.out.print("Welcome to MCQ Test! \n\nPlease enter your name: ");
        String name = sc.nextLine();
        Student students = new Student(name);
        students.setName(name);
        System.out.println("Hi " + students.name + " Hai I hope you get good results :D \n");

    }
}
