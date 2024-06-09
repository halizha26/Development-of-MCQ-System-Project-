public class StartTest extends FileReaderCSV {
    double score = 0;
    String TEST_1 = "1: Introduction to Web Technologies (Core)";
    String TEST_2 = "2: Front-End Technologies (Core)";
    public void chooseTheTest() {
        System.out.println("Choose your test!");
        System.out.printf("%s \n%s", TEST_1, TEST_2);
    }
}
