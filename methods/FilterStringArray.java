package methods;

import java.util.Arrays;
import java.util.Scanner;


public class FilterStringArray {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = scanner.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = scanner.nextInt();
		
		String[] words = userInput.split("\\s+");//this regex means match all the single whitespace characters
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
        String[] filterdWords = new String[words.length];
        int filterdWordsIndex = 0;
        for(int i = 0; i < words.length; i++){
            if(words[i].length() > minLength){
                filterdWords[filterdWordsIndex] = words[i];
                filterdWordsIndex++;
            }
        }
        String[] newFilterdWords = new String[filterdWordsIndex];
        for(int i = 0; i < filterdWordsIndex; i++){
            newFilterdWords[i] = filterdWords[i];
        }
        return newFilterdWords;
	}

}
