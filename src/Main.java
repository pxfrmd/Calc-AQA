import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        calc(input);
    }
    public static String calc(String input) {

        int result = 0;

        String [] arr = input.split(" ");

        if (arr.length != 3) {
            throw new RuntimeException("Слишком много операторов");
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

        result = switch (secondOperand) {
            case "/" -> firstOperand / thirdOperand;
            case "+" -> firstOperand + thirdOperand;
            case "-" -> firstOperand - thirdOperand;
            case "*" -> firstOperand * thirdOperand;
            default -> throw new RuntimeException("Недопустимый оператор!");
        };
        System.out.println(Integer.toString(result));
        return Integer.toString(result);
    }

    static void testing (int firstOperand, int thirdOperand) {
        if ( (firstOperand > 10 || firstOperand < 1 )|| (thirdOperand > 10 || thirdOperand < 1)) {
            throw new RuntimeException("Принимаются значения от 0 до 10 включительно!");
        }
    }
}
