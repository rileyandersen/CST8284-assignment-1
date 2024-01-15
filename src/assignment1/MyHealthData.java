package assignment1;

import java.util.Calendar;

/**
 * The MyHealthData class represents health information about a patient.
 * It stores attributes such as first name, last name, gender, and health metrics.
 * Additionally, it calculates patient age, BMI, and heart rate information.
 * @author Riley Andersen
 * @version 1.1
 * @since Java 1_8.301
 * @see MyHealthDataBase
 */
public class MyHealthData extends MyHealthDataBase {
	
	private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int currentYear;
    private double height; //in inches
    private double weight; //in inches
		
    /**
     * Constructs a MyHealthData object with patient data.
     *
     * @param firstName   The patient's first name.
     * @param lastName    The patient's last name.
     * @param gender      The patient's gender.
     * @param birthYear   The year of the patient's birth.
     * @param height      The patient's height (in inches).
     * @param weight      The patient's weight (in pounds).
     */
    
    public MyHealthData(String firstName, String lastName, String gender, int birthYear, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR);
    }
    
    /**
     * Gets the patient's first name.
     *
     * @return The first name of the patient.
     */    
    
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the patient's first name.
     *
     * @param firstName The first name to set.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the patient's last name.
     *
     * @return The last name of the patient.
     */    
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the patient's last name.
     *
     * @param lastName The last name to set.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the patient's gender.
     *
     * @return The gender of the patient.
     */    
    public String getGender() {
        return gender;
    }

    /**
     * Sets the patient's first name.
     *
     * @param gender The gender to set.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Gets the patient's birth year.
     *
     * @return The birth year of the patient.
     */    
    public int getBirthYear() {
        return birthYear;
    }

    /**
     * Sets the patient's birth year.
     *
     * @param birthYear The birth year to set.
     */
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * Gets the current year.
     *
     * @return The current year.
     */    
    public int getCurrentYear() {
        return currentYear;
    }
    
    // No set method for currentYear

    /**
     * Gets the patient's height.
     *
     * @return The height of the patient.
     */    
    public double getHeight() {
        return height;
    }

    /**
     * Sets the patient's height.
     *
     * @param height The height to set.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the patient's weight.
     *
     * @return The weight of the patient.
     */    
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the patient's weight.
     *
     * @param weight The weight to set.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    /**
     * Calculates the patient's age based on the birth year and current year.
     *
     * @return The patient's age in years.
     */
    public int getAge() {
    	return currentYear - birthYear;
    }
    
    /**
     * Calculates the patient's maximum heart rate based on their age.
     *
     * @return The patient's maximum heart rate.
     */
    public int calculateMaximumHeartRate() {
        return 220 - getAge();
    }

    /**
     * Calculates the patient's minimum target heart rate based on their maximum heart rate.
     *
     * @return The patient's minimum target heart rate.
     */
    public int calculateMinimumTargetHeartRate() {
        int maxHeartRate = calculateMaximumHeartRate();
        return (int) (0.5 * maxHeartRate);
    }

    /**
     * Calculates the patient's maximum target heart rate based on their maximum heart rate.
     *
     * @return The patient's maximum target heart rate.
     */
    public int calculateMaximumTargetHeartRate() {
        int maxHeartRate = calculateMaximumHeartRate();
        return (int) (0.85 * maxHeartRate);
    }
    
    /**
     * Calculates and returns the Body Mass Index (BMI) of the patient.
     *
     * The BMI is calculated using the patient's weight (in pounds) and height (in inches).
     *
     * @return The BMI value for the patient.
     */
    public double calculateBMI() {
        return super.calculateBMI(getWeight(), getHeight());
    }
    
    /**
     * Displays the patient's health data, including age, BMI, and heart rate information.
     */
    public void displayMyHealthData()
    { 

    
    	
        // Display patient's health data using System.out.printf
        System.out.printf("First Name: %s%n", getFirstName());
        System.out.printf("Last Name: %s%n", getLastName());
        System.out.printf("Gender: %s%n", getGender());
        System.out.printf("Year of birth: %d%n", getBirthYear());
        System.out.printf("Height (in inches): %.2f%n", getHeight());
        System.out.printf("Weight (in pounds): %.2f%n", getWeight());

        // Calculate and display patient's age
        int age = getAge();
        System.out.printf("Age: %d%n", age);

        // Calculate and display BMI
        double bmi = calculateBMI();
        System.out.printf("BMI: %.2f%n", bmi);
        
        // Calculate and display maximum heart rate
        int maxHeartRate = calculateMaximumHeartRate();
        System.out.printf("Maximum Heart Rate: %d%n", maxHeartRate);

        // Calculate and display target heart rate range
        int minTargetHeartRate = calculateMinimumTargetHeartRate();
        int maxTargetHeartRate = calculateMaximumTargetHeartRate();
        System.out.printf("Minimum Target Heart Rate: %d%n", minTargetHeartRate);
        System.out.printf("Maximum Target Heart Rate: %d%n", maxTargetHeartRate);
        
        //Display a guide for BMI scale
        System.out.println("BMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");   
    } 

} // end class MyHealthData