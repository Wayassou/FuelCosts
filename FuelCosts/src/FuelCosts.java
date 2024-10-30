import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gallons = getValidDouble(input, "Enter gallons of gas in tank: ");
        double mpg = getValidDouble(input, "Enter fuel efficiency (mpg): ");
        double pricePerGallon = getValidDouble(input, "Enter price per gallon: ");

        double costToDrive100 = (100 / mpg) * pricePerGallon;
        double distanceWithFullTank = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + costToDrive100);
        System.out.println("Distance with a full tank: " + distanceWithFullTank + " miles");
    }

    private static double getValidDouble(Scanner input, String prompt) {
        double value = 0;
        boolean validInput;
        do {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                value = input.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input.next();
                validInput = false;
            }
        } while (!validInput);
        return value;
    }
}
