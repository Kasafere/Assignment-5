
import static org.junit.Assert.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TwoDimRaggedArrayUtilitySTUDENTTest {
	// create several (more than 2) data sets for testing. These data sets must be
	// different
	// then the data sets in TwoDimRaggedArrayUtilityTest
	private double[][] dataSet1 = { { 1.1, 2.2, 3.3, 4.4 }, { 5.5, 6.6, 7.7 }, { 8.8, 9.9 } };
	private double[][] dataSet2 = { { -1, 2, -3, 4 }, { -5 }, { 6, -7, 8 }, { -9, 10, -11, 12 } };
	private double[][] dataSet3 = { { -15.1, -33.3, -9.9, -71.6 }, { -9.5, -21.3 }, { -18.9, -11.7, -23.8 },
			{ -17.6, -26.9, -27.7, -32.1 } };

	private File inputFile, outputFile;

	@Before
	public void setUp() throws Exception {
		outputFile = new File("TestOut.txt");
	}

	@After
	public void tearDown() throws Exception {
		dataSetSTUDENT = null;
		inputFile = outputFile = null;
	}

	/**
	 * Student Test getTotal method Return the total of all the elements in the two
	 * dimensional array
	 */
	@Test
	public void testGetTotal() {
		fail("Student testGetTotal not implemented");
	}

	/**
	 * Student Test getAverage method Return the average of all the elements in the
	 * two dimensional array
	 */
	@Test
	public void testGetAverage() {
		fail("Student testGetAverage not implemented");
	}

	/**
	 * Student Test getRowTotal method Return the total of all the elements of the
	 * row. Row 0 refers to the first row in the two dimensional array
	 */
	@Test
	public void testGetRowTotal() {
		fail("Student testGetRowTotal not implemented");
	}

	/**
	 * Student Test getColumnTotal method Return the total of all the elements in
	 * the column. If a row in the two dimensional array doesn't have this column
	 * index, it is not an error, it doesn't participate in this method. Column 0
	 * refers to the first column in the two dimensional array
	 */
	@Test
	public void testGetColumnTotal() {
		fail("Student testGetColumnTotal not implemented");
	}

	/**
	 * Student Test getHighestInArray method Return the largest of all the elements
	 * in the two dimensional array.
	 */
	@Test
	public void testGetHighestInArray() {
		fail("Student testGetHighestInArray not implemented");
	}

	/**
	 * Test the writeToFile method write the array to the outputFile File then read
	 * it back to make sure formatted correctly to read
	 * 
	 */
	@Test
	public void testWriteToFile() {
		double[][] array = null;
		fail("Student testWriteToFile not implemented");
	}

}