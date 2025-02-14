import java.util.Scanner;

public class FACTORIAL {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate the factorial using a method
        long result = calculateFactorial(number);
        
        // Display the result
        System.out.println("The factorial of " + number + " is: " + result);
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        long factorial = 1;
        
        // Factorial calculation logic
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}
