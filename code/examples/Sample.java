/**
 * Sample Java Test Code
 * 
 * This is a simple Java example demonstrating basic testing concepts.
 */

public class Sample {
    
    /**
     * Add two numbers
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtract b from a
     */
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiply two numbers
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Divide a by b
     */
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }
    
    /**
     * Main method for testing
     */
    public static void main(String[] args) {
        System.out.println("Addition: 5 + 3 = " + add(5, 3));
        System.out.println("Subtraction: 5 - 3 = " + subtract(5, 3));
        System.out.println("Multiplication: 5 * 3 = " + multiply(5, 3));
        System.out.println("Division: 6 / 3 = " + divide(6, 3));
    }
}
