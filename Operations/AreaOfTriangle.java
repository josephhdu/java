package Operations;
import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
        int sideA = sc.nextInt();
		//<write your code here>
		
		System.out.print("Please, enter B side of a triangle: ");
        int sideB = sc.nextInt();
		//<write your code here>
		
		System.out.print("Please, enter C side of a triangle: ");
        int sideC = sc.nextInt();
		//<write your code here>
		
		//<write your code here>
		int p = (sideA + sideB + sideC)/2;
        double triangleArea = Math.sqrt(p * (p-sideA) * (p-sideB) * (p-sideC));

		System.out.println("Triangle area is: " + triangleArea);
		
	}

}