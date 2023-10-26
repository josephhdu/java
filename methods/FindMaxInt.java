package methods;
import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
        String numbers = sc.nextLine();
        String[] numArr = numbers.split(" ");

        int[] intArr = new int[numArr.length];

        for(int i = 0; i < numArr.length; i++){
            intArr[i] = Integer.parseInt(numArr[i]);
        }
	
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArr));

        int maxInt = findMaxIntInArray(intArr);

		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}


	public static int findMaxIntInArray(int[] intArray) {
		int max = 0;
        for(int i: intArray){
            if(i > max){
                max = i;
            }
        }
        return max;
	}

}
