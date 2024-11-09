import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Perform a division");
            System.out.println("2. Access an array element");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    try {
                        System.out.print("Enter the dividend: ");
                        int dividend = scanner.nextInt();
                        System.out.print("Enter the divisor: ");
                        int divisor = scanner.nextInt();
                        int result = dividend / divisor; 
                        System.out.println("The result of division is: " + result);
                    } catch (ArithmeticException ex) {
                        System.out.println("Exception occurred: " + ex.getMessage());
                    }
                    break;

                case 2:
                    try {
                        int[] numbers = { 10, 20, 30, 40, 50 };
                        System.out.print("Enter the index to access (0-4): ");
                        int index = scanner.nextInt();
                        System.out.println("The number at index " + index + " is: " + numbers[index]);
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        System.out.println("Exception occurred: " + ex.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid option. Please select 1 or 2.");
                    break;
            }

            System.out.print("Do you want to try again? (Y/N): ");
            continueChoice = scanner.next().charAt(0);
        } while (continueChoice == 'Y' || continueChoice == 'y');

        scanner.close();
        System.out.println("Thank you for using the program!");
    }
}
