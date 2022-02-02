import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int operand1;//объявляю первый операнд
        int operand2;// объявляю второй операнд
        int result;// переменная для результата операции
        char operation;//объявляю оператор
        Scanner scanner = new Scanner(System.in);//создаю объект класса Scanner, чтобы потом использовать его методы
        System.out.println("Enter 2 operands: ");
        operand1 = scanner.nextInt();//Инициализирую операнды
        operand2 = scanner.nextInt();
        System.out.print("\nEnter an operator (+, -, *, /): ");//строка для ввода оператора
        operation = scanner.next().charAt(0);// считываем строку ввода и берём первый символ
        switch(operation) {
            case '+': result = operand1 + operand2;
                break;
            case '-': result = operand1 - operand2;
                break;
            case '*': result = operand1 * operand2;
                break;
            case '/': result = operand1 / operand2;
                break;
            default:  System.out.println("Error! Enter a correct operator");
                return;
        } //переключатель операторов
        System.out.print("\nThe result:\n");
        System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);//выводим выражение целиком
    }
}