package methods;

import java.util.Scanner;

public class MatrixRotation {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode, size)) {
			printMatrixToConsole(matrix);
		}
	}
	
	private static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Double.valueOf(Integer.toString(i) + "." 
						+ Integer.toString(j));
			}
		}
		return matrix;
	}
	
	private static void printMatrixToConsole(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private static boolean rotateMatrix(double[][] matrix, int mode, int size) {
		switch (mode) {
			case 1:
				System.out.println("90 degrees rotated:" + System.lineSeparator());
				rotate90(matrix, size);
				break;
			case 2:
				System.out.println("180 degrees rotated:" + System.lineSeparator());
				rotate180(matrix, size);
				break;
			case 3:
				System.out.println("270 degrees rotated:" + System.lineSeparator());
				rotate270(matrix, size);
				break;
			default:
				System.out.println("You selected non-existing mode!");
				return false;
			}
		return true;
	}
	
	public static void rotate90(double[][] matrix, int size) {
		//<write your code here>
	}

	public static void rotate180(double[][] matrix, int size) {
		//<write your code here>
	}

	public static void rotate270(double[][] matrix, int size) {
		//<write your code here>
	}


}
