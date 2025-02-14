# Factorial-of-a-number
Explanation:
User Input:
The program uses a Scanner object to capture input from the user. The user is asked to enter a number for which they want to calculate the factorial.
Factorial Calculation:
The program defines a method called calculateFactorial(int n) to calculate the factorial of the number.
Inside the method: 
A long variable factorial is initialized to 1 (since the factorial of 0 or 1 is 1).
A for loop iterates from 1 to the number n. During each iteration, it multiplies the factorial variable by the current loop counter i.
After the loop finishes, the calculated factorial is returned.
Displaying the Result:
The result of the factorial calculation is displayed in the main method using System.out.println.
Closing the Scanner:
The scanner.close() method is called to close the Scanner object and release the resources once the input is complete.
Example of Factorial Calculation:
For an input of 5, the factorial is calculated as:
5! = 5 * 4 * 3 * 2 * 1 = 120.
Why It Works:
For Loop: The for loop multiplies all integers from 1 to n, which is the definition of factorial.
Data Type: The long data type is used for the factorial result to handle large numbers, as factorials grow very fast.
Edge Case:
If the user inputs 0, the factorial will correctly return 1, since 0! = 1 by definition.
This program is efficient for calculating factorials for reasonably small numbers. However, for very large numbers (like 50! or higher), the result may exceed the limits of the long data type, leading to overflow.
