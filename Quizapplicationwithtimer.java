import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Quizapplicationwithtimer {
    static class Question {
        String question;
        String[] options;
        char correctAnswer;

        public Question(String question, String[] options, char correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        // Create quiz questions
        Question[] questions = new Question[]{
                new Question("What is the capital of Madhya Pradesh?", new String[]{"a. Betul", "b. Indore", "c. Bhopal", "d. Raisen"}, 'c'),
                new Question("Which planet having ozone layer?", new String[]{"a. Mars", "b. Earth", "c. Jupiter", "d. Venus"}, 'b'),
                new Question("What is the the famous indian vegetarian Dish ?", new String[]{"a. Fast Food", "b. Dal Bati", "c. Baigan Bharta", "d. Butter Panner Masala"}, 'd')
        };

        int score = 0;
        int timeLimit = 10; // seconds per question

        for (Question question : questions) {
            System.out.println(question.question);
            for (String option : question.options) {
                System.out.println(option);
            }

            // Timer task to handle time limit
            TimerTask task = new TimerTask() {
                @Override
                public void run() {
                    System.out.println("\nTime's up!");
                    System.exit(0);
                }
            };
            timer.schedule(task, timeLimit * 1000);

            System.out.print("Enter your answer: ");
            char answer = scanner.next().charAt(0);

            task.cancel(); // Cancel the timer if answer is given in time

            if (answer == question.correctAnswer) {
                score++;
            }
        }

        System.out.println("\nQuiz Completed!");
        System.out.println("Your score: " + score + "/" + questions.length);
        scanner.close();
        timer.cancel();
    }
}
