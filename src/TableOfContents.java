import java.util.Scanner;

public class TableOfContents {
    private static int userAnswer;

    public TableOfContents(){
        this.userAnswer = 0;
    }

    public static void main(String[] args) {
        String s = "Lessons available";
        System.out.printf("%-27s", s);

        for (int i = 0; i < 19; i++){
            System.out.print("-");
        }
        System.out.print("Please make a choice");
        Scanner userInput = new Scanner(System.in);
        userAnswer = userInput.nextInt();

        System.out.println("Limits and Continuity (1)");
        System.out.println("Differential Equations (2)");
        System.out.println("Derivatives part A (3) ");
        System.out.println("Derivatives part B (4) ");
        System.out.println("Applications of Derivatives (5)");
        System.out.println();
        System.out.println("Exam 1 (6)");
        System.out.println("Exam 2 (7)");
        System.out.println("Back (8)");

        if (userAnswer == 1){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(1);
        }
        if (userAnswer == 2){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(2);

        }
        if (userAnswer == 3){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(3);

        }
        if (userAnswer == 4){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(4);
        }
        if (userAnswer == 5){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(5);
        }
        if (userAnswer == 6){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(6);
        }
        if (userAnswer == 7){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(7);
        }
        if (userAnswer == 8){
            CalculusLesson lesson = new CalculusLesson();
            lesson.main(8);
        }
    }
}




