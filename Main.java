import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("2*2", new String[]{"1) 4", "2) 5", "3) 7", "4) 8"},0));
        Viktorina viktorina = new Viktorina(questions);
        viktorina.start();
    }
}