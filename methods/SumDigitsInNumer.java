package methods;

import java.util.Scanner;

public class SumDigitsInNumer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		String strNum = String.valueOf(number);
        char[] nums = strNum.toCharArray();
        int sum = 0;
        for(char digit: nums){
            sum += (int)digit - 48;
        }
        return sum;
	}
}
