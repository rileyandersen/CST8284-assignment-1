package assignment1;

/**
* MyHealthDataBase is a base class to be extended for the Electronic Health Records (EHR) System,
* also known as Assignment 1.  It contains a method to calculate BMI and will contain other methods.
* @author Riley Andersen
* @version 1.1
* @since Java 1_8.301
* @see MyHealthData
*/

public class MyHealthDataBase
{
    /** 
    * This method returns the calculated Body Mass Index (BMI) from data provided.
    * @param weightParam Weight of the patient in pounds.
    * @param heightParam Height of the patient in inches.
    */
    public double calculateBMI(double weightParam, double heightParam)
    {
        return weightParam * 703 / (heightParam * heightParam);
    }
    
    /** 
     * This method returns an incorrect Body Mass Index (BMI) from data provided.
     * The conversion number is changed from 703 to 500.
     * @param weightParam Weight of the patient in pounds.
     * @param heightParam Height of the patient in inches.
     */
    public double incorrectBMI(double weightParam, double heightParam)
    {
        return weightParam * 500 / (heightParam * heightParam);
    }
}