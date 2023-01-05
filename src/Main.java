import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calc("5 - 10");
    }
    public static void calc (String input) {
        int result = 0;

        String [] arr = input.split(" ");

        if (arr.length != 3) {
            throw new RuntimeException();
        }

        int firstOperand = 0;
        String secondOperand = arr[1];
        int thirdOperand = 0;


        try {
            firstOperand = Integer.parseInt(arr[0]);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        try {
            thirdOperand = Integer.parseInt(arr[2]);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }

        testing(firstOperand,thirdOperand);

        switch (secondOperand) {
            case "/":
                result = firstOperand / thirdOperand;
                break;
            case "+":
                result = firstOperand + thirdOperand;
                break;
            case "-":
                result = firstOperand - thirdOperand;
                break;
            case "*":
                result = firstOperand * thirdOperand;
                break;
            default:
                throw new RuntimeException();
        }
        System.out.println(result);
    }

    static void testing (int firstOperand, int thirdOperand) {
        if ( (firstOperand > 10 || firstOperand < 1 )|| (thirdOperand > 10 || thirdOperand < 1)) {
            throw new RuntimeException();
        }
    }
}
