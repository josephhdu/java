package loops;
import java.util.Scanner;

public class NewLineForDigit {
    
    public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
        String num = sc.next();
        num = num.strip();
        char[] charNum = ((String)num).toCharArray();
        for(char c : charNum){
            System.out.println(c);
        }

    }

}
