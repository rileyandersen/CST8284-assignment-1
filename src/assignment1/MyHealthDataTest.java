package assignment1;

import java.util.Scanner;

/**
 * The MyHealthDataTest class is a driver program for entering patient data and 
 * displaying health information using the MyHealthData class.
 * @author Riley Andersen
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthDataBase
 */

public class MyHealthDataTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        // Prompt for input
        System.out.println("Enter patient's data:");

        System.out.print("First Name: ");
        String firstName = input.nextLine();

        System.out.print("Last Name: ");
        String lastName = input.nextLine();

        System.out.print("Gender: ");
        String gender = input.nextLine();

        System.out.print("Birth Year: ");
        int birthYear = input.nextInt();

        System.out.print("Height (in inches): ");
        double height = input.nextDouble();

        System.out.print("Weight (in pounds): ");
        double weight = input.nextDouble();

        // Create MyHealthData object
        MyHealthData patientData = new MyHealthData(firstName, lastName, gender, birthYear, height, weight);
		
        //Call method to display health data
        patientData.displayMyHealthData();
	}
}