package methods;

import java.util.Scanner;

public class AmountOfWords {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
        
        String words = scanner.nextLine();
        int amountOfWords = getWordsAmount(words);
	
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		text = text.trim();
        String[] wordArr;
        wordArr = text.split(" ");
        int wordNum = wordArr.length;
        return wordNum;
	}

}
