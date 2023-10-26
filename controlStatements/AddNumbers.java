package controlStatements;

public class AddNumbers {
    public static void main(String[] args) {
        if(args[0].indexOf('.') >= 0 || args[1].indexOf('.') >= 0){
            float num1 = Float.parseFloat(args[0]);
            float num2 = Float.parseFloat(args[1]);

            float result = num1 + num2;
            System.out.println(result);
        } else {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            int result = num1 + num2;
            System.out.println(result);
        }

	}
}
