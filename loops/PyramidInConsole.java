package loops;
import java.util.Scanner;

public class PyramidInConsole {
        public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = height - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
