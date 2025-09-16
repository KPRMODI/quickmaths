import java.util.Scanner;

public class NumberManipulator {

        public static Scanner scanner = new Scanner(System.in);

        public static Float getFloatInput(String prompt) { // Gets string input
        System.out.print(prompt); //Gets input
        return scanner.nextFloat();
    }

    public static void main(String[] args) {
        // Prompt the user to enter a decimal number
        // Store the input in a variable
        Float user_number = getFloatInput("Enter a decimal number: ");

        // Print the smallest integer greater than or equal to the number by ceiling it (raising it up if above 0.5 or more)
        System.out.println("The smallest integer that is greater than or equal to: " + user_number+" is: " + (int) Math.ceil(user_number));

        // Print the largest integer less than or equal to the number by flooring it (lowering it if lower than 0.4 or les)
        System.out.println("The largest integer that is less than or equal to: " + user_number+" is: " + (int) Math.floor(user_number));

        // Print the integer that is closest to the number (ties go to even) by using rint which rounds even numbers lower than 0.5 and rounds odd numbers higher than 0.5 with bakers rounding logic.
        System.out.println("The closest integer to the number with ties going to the even number to: " + user_number+" is: " + Math.rint(user_number));

        // Print the integer closest to the number (standard rounding) nothing too special about this
        System.out.println("The closest integer to the number is: " + user_number+" is: " + (int) Math.round(user_number));

        // BONUS:
        // Cast the number to an int and print the character it represents
        char user_character = (char) Math.round(user_number);// casts user_number as a character as long as it meets ASCII standards
        
        // Format a summary table using formatted output
         System.out.printf("%d ------> '%s'\n",Math.round(user_number), user_character); // %d for decimal and %s for strings
        // You have to use larger numbers in order to convert a number to char with ASCII
        
        // Add 1 to that number and print the next character
        user_character++; //increment the variable by 1
        user_number++; //increment the variable by 1
         System.out.printf("%d ------> '%s'",Math.round(user_number), user_character);
    }
}
