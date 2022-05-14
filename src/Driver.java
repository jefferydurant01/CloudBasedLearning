import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to Calc 1!");
        System.out.println("Please enter your name! If you already have a profile, please type in '0'.");
        String name = input.next();
        if (name.equals("0")){
            System.out.println("Welcome back! Enter your name.");

        }

    }
}
