public class Student {
    String name;
    static int score;
    static int correct;
    static int wrong;
    static int question;
    public Student(String input) {
        this.name = input;
        Main.s = this;
    }
    public static int getCorrect() {return correct;}
    public static int getWrong() {return wrong;}
    public static int getQuestion() {return question;}
    public static int getScore() {return score;}
    public String setName(String name) {
        return this.name = name;
    }
}


