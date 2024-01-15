package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The MyHealthDataTest2 class is used to perform JUnit testing of the
 * calculateBMI method, and the incorrectBMI method.
 * @author Riley Andersen
 * @version 1.1
 * @since Java 1_8.301
 */
public class MyHealthDataTest2 {

	//Create instance of MyHealthData, call calculateBMI to test the result
	@Test
    public void testCalculateBMI() {
        MyHealthData patient = new MyHealthData("John", "Doe", "Male", 1990, 70.0, 160.0);
        double expectedBMI = 22.96;
        double actualBMI = patient.calculateBMI();
        assertEquals(expectedBMI, actualBMI, 0.01);
    }
	
	
	//Create instance of MyHealthDataBase, call incorrectBMI to test the result
	@Test
    public void testIncorrectBMI() {
        MyHealthDataBase data = new MyHealthDataBase();
        double weight = 160.0;
        double height = 70.0;
        double expectedBMI = 22.96;
        double actualBMI = data.incorrectBMI(weight, height);
        assertEquals(expectedBMI, actualBMI, 0.01);
    }
}
