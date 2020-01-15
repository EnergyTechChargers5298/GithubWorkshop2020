// Template for your file
public class ExampleHello { 
    
    // Create your entry point
    public static void main(String[] args) {
    // Print some code!
        System.out.println("Hello World");
        
        int numberOne = 20;
        int numberTwo = 10;

        int remainder = numberOne % numberTwo;

        System.out.println(remainder);

        multiply(20, 12);
    }

    public static void multiply (int num1, int num2) {
        int value = num1 * num2;
        System.out.println(value);
    }
}
