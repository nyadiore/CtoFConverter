import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        do {
            System.out.print("Enter a temperature in Celsius: ");
            // Check if the input is valid
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                // Conversion formula
                fahrenheit = (celsius * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit is: " + fahrenheit);
                break; //exit loop
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear the invalid input
            }
        } while (true);
    }
}