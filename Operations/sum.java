package Operations;
import java.util.Scanner;

public class sum {


    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int i1 = sc.nextInt();
		System.out.print("Enter the second integer: ");
		int i2 = sc.nextInt();
		
		int sum = i1 + i2;
	    System.out.println("Answer is:" + sum);
	}

}
