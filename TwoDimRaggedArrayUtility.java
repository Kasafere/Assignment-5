import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility extends Object {

	public TwoDimRaggedArrayUtility() {
	}

	public static double getHighestInArray(double[][] data) {

		double highest = data[0][0];

		for (int i = 0; i < data.length; i++) {
			for (int a = 0; a < data[i].length; a++)

				if (data[i][a] > highest)
					highest = data[i][a];
		}

		return highest;
	}

	public static double getLowestInArray(double[][] data) {

		double lowest = data[0][0];

		for (int i = 0; i < data.length; i++) {
			for (int a = 0; a < data[i].length; a++)

				if (data[i][a] < lowest)
					lowest = data[i][a];
		}

		return lowest;
	}

	public static double getHighestInRow(double[][] data, int row) {

		double highestInRow = data[row][0];

		for (int a = 0; a < data[row].length; a++)
			if (data[row][a] > highestInRow)
				highestInRow = data[row][a];

		return highestInRow;

	}

	public static int getHighestInRowIndex(double[][] data, int row) {

		double highestInRow = data[row][0];
		int index = 0;

		for (int a = 0; a < data[row].length; a++)
			if (data[row][a] > highestInRow) {
				highestInRow = data[row][a];
				index = a;
			}

		return index;

	}

	public static double getHighestInColumn(double[][] data, int col) {

		double highestInCol = Double.MIN_VALUE;

		for (int i = 0; i < data.length; i++)
			if (col < data[i].length)
				if (data[i][col] > highestInCol)
					highestInCol = data[i][col];

		return highestInCol;

	}

	static int getHighestInColumnIndex(double[][] data, int col) {

		int index = 0;
		double highestInCol = data[0][col];

		for (int i = 0; i < data.length; i++) {

			if (col < data[i].length)
				if (data[i][col] > highestInCol) {
					highestInCol = data[i][col];
					index = i;
				}
		}

		return index;

	}

	public static double getLowestInRow(double[][] data, int row) {

		double lowestInRow = data[row][0];

		for (int a = 0; a < data[row].length; a++)
			if (data[row][a] < lowestInRow)
				lowestInRow = data[row][a];

		return lowestInRow;
	}

	public static int getLowestInRowIndex(double[][] data, int row) {

		int index = 0;
		double lowestInRow = data[row][0];

		for (int a = 0; a < data[row].length; a++)
			if (data[row][a] < lowestInRow) {
				lowestInRow = data[row][a];
				index = a;
			}

		return index;
	}

	public static double getLowestInColumn(double[][] data, int col) {

		double lowestInCol = Double.MAX_VALUE;

		for (int i = 0; i < data.length; i++) {

			if (col < data[i].length) {

				if (data[i][col] < lowestInCol)
					lowestInCol = data[i][col];

			}

		}

		return lowestInCol;
	}

	public static int getLowestInColumnIndex(double[][] data, int col) {

		int index = 0;
		double lowestInCol = data[0][col];

		for (int i = 0; i < data.length; i++)
			while (col < data[i].length) {
				if (data[i][col] < lowestInCol) {
					lowestInCol = data[i][col];
					index = i;
				}

				break;
			}

		return index;
	}

	public static double getTotal(double[][] data) {

		double total = 0.0;

		for (int i = 0; i < data.length; i++) {
			for (int a = 0; a < data[i].length; a++)

				total += data[i][a];
		}

		return total;
	}

	public static double getAverage(double[][] data) {

		double count = 0.0;
		double average = 0.0;
		double total = 0.0;

		for (int i = 0; i < data.length; i++) {
			for (int a = 0; a < data[i].length; a++) {

				count++;
				total += data[i][a];
			}
		}

		return total / count;
	}

	public static double getRowTotal(double[][] data, int row) {

		double rowTotal = 0.0;

		for (int a = 0; a < data[row].length; a++)
			rowTotal += data[row][a];

		return rowTotal;
	}

	public static double getColumnTotal(double[][] data, int col) {

		double colTotal = 0.0;

		for (int i = 0; i < data.length; i++)

			if (col < data[i].length) {

				colTotal += data[i][col];

			}

		return colTotal;
	}

	public static double[][] readFile(File file) throws FileNotFoundException {

		Scanner scanner = new Scanner(file);

		String temporaryfileArray[][] = new String[10][10];
		double[][] filearray = null;

		int rows = 1;
		int columns;

		for (int i = 0; scanner.hasNextLine() && i < temporaryfileArray.length; i++) {
			filearray = new double[rows][];
			temporaryfileArray[i] = scanner.nextLine().split(" ");

			rows++;
		}

		for (int i = 0; i < filearray.length; i++) {

			columns = 0;

			for (int a = 0; a < temporaryfileArray[i].length; a++) {

				if (temporaryfileArray[i][a] != null) {

					columns += 1;
				}

			}

			filearray[i] = new double[columns];
		}

		for (int i = 0; i < filearray.length; i++)
			for (int a = 0; a < filearray[i].length; a++) {
				filearray[i][a] = Double.parseDouble(temporaryfileArray[i][a]);
			}

		scanner.close();
		return filearray;
	}

	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException {

		PrintWriter inFile = new PrintWriter(outputFile);
		for (int i = 0; i < data.length; i++) {
			for (int a = 0; a < data[i].length; a++)
				inFile.print(data[i][a] + " ");
			inFile.println();
		}
		inFile.close();
	}

}