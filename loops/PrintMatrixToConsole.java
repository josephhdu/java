package loops;

public class PrintMatrixToConsole {
    public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		for(int[] array: matrix){
            for(int i = 0; i < array.length; i++){
                System.out.printf("%d\t", array[i]);
            }
            System.out.println();
        }

	}
	
}
