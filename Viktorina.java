import java.util.ArrayList;
import java.util.Scanner;

public class Viktorina {
    int countOfQuestion;
    int countOfCorrectAnswers;
    int countOfIncorrectAnswers;

    ArrayList<Question> questions;

    public Viktorina( ArrayList<Question> questions) {
        this.countOfQuestion = questions.size();
        this.countOfCorrectAnswers = 0;
        this.countOfIncorrectAnswers = 0;
        this.questions = questions;
    }
    public void start(){
        for(Question question: questions ){
            System.out.println(question.getQuestion());
            for(String answer: question.getAnswers()){
                System.out.println(answer);
            }
            Scanner scanner = new Scanner(System.in);
            int result = scanner.nextInt();
            if(result == question.getCorrectAnswer()+1){
                System.out.println("correct");
                ++countOfCorrectAnswers;
            } else {
                System.out.println("incorrect");
                ++countOfIncorrectAnswers;
            }
        }
        System.out.println("----------------------------");

        System.out.println("result");
        System.out.println("correct answers " + countOfCorrectAnswers);
        System.out.println("incorrect answers "  + countOfIncorrectAnswers);


    }

}
