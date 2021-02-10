
package by.itacademy.java.jd1.apetrov.practice.pak1_2;

import java.util.Random;
import java.util.Scanner;

public class Task1 {

	private Scanner input;

	public static void main(final String[] args) {
		Task1 classObject = new Task1();
		int[][] matrix;
		int matrixSize;
		int k;

		matrixSize = classObject.inputMatrixSize();
		k = classObject.inputK();
		matrix = classObject.generateMatrix(matrixSize, k);
		classObject.printMatrix(matrix);

	}

	private int inputPositiveInt() {
		input = new Scanner(System.in);
		int inputNumber;
		do {
			System.out.println("Please enter positive integer:");
			while (!input.hasNextInt()) {
				System.out.println("This not an integer! Try again: ");
				input.next();
			}
			inputNumber = input.nextInt();
		} while (inputNumber < 0);
		return inputNumber;
	}

	private int inputMatrixSize() {
		System.out.print("Enter array size\n");
		int arraySize = inputPositiveInt();
		return arraySize;
	}

	private int inputK() {
		System.out.print("Enter value of K\n");
		int k = inputPositiveInt();
		return k;
	}

	private int[][] generateMatrix(final int size, final int valueK) {
		int[][] generatedMatrix = new int[size][size];
		Random random = new Random();

		for (int i = 0; i < generatedMatrix.length; i++) {
			for (int j = 0; j < generatedMatrix.length; j++) {
				generatedMatrix[i][j] = 1 + random.nextInt(valueK);
			}
		}
		return generatedMatrix;
	}

	private void printMatrix(final int[][] getMatrix) {
		for (int i = 0; i < getMatrix.length; i++) {
			for (int j = 0; j < getMatrix.length; j++) {
				System.out.printf("%d\t", getMatrix[i][j]);
			}
			System.out.print("\n");
		}
	}
}
