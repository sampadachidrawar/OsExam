//create a program to initialise a number to  some value and find if it is even or odd in java
public class EvenOrOdd {
    public static void main(String[] args) {
        // Initialize the number
        int number = 10; // You can change this value to any number you want to check

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
