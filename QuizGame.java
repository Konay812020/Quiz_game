import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int score = 0;
        int totalQuestions = 5;

        String[][] questions = {
                {"What is the capital of France?", "A. London", "B. Paris", "C. Berlin", "D. Rome", "B"},
                {"What is the largest planet in our solar system?", "A. Jupiter", "B. Saturn", "C. Earth", "D. Mars", "A"},
                {"What is the chemical symbol for gold?", "A. Ag", "B. Au", "C. Fe", "D. Cu", "B"},
                {"Who painted the Mona Lisa?", "A. Vincent van Gogh", "B. Leonardo da Vinci", "C. Michelangelo", "D. Rembrandt", "B"},
                {"What is the highest mountain in the world?", "A. Mount Everest", "B. K2", "C. Kangchenjunga", "D. Lhotse", "A"}
        };

        for (String[] question : questions) {
            System.out.println(question[0]);
            for (int i = 1; i <= 4; i++) {
                System.out.println(question[i]);
            }

            System.out.print("Enter your answer (A, B, C, or D): ");
            String answer = input.nextLine().toUpperCase();

            if (answer.equals(question[5])) {
                score++;
                System.out.println("Correct!\n");
            } else {
                System.out.println("Incorrect. The correct answer is " + question[5] + "\n");
            }
        }

        double percentage = (double) score / totalQuestions * 100;
        System.out.println("Your final score is: " + score + " out of " + totalQuestions + " (" + String.format("%.2f", percentage) + "%)");
    }
}
