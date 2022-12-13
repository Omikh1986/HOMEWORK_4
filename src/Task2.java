import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 2 Реализовать консольное приложение, которое:
 * Принимает от пользователя строку вида
 * text~num
 * Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
 * Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 * Если ввод не содержит символа ~, то завершает программу с ошибкой.
 * Если введено -1, то выходим
 * <p>
 * string~3
 * java~5
 * print~0 => ""
 * print~3 => string
 */

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strList = new ArrayList<>();
        String[] inputArray = new String[2];
        String input = "";
        System.out.println("Введите строку вида text~num, для выхода введите -1");
        input = sc.nextLine();
        while (!input.equals("-1")) {
            if (!input.matches(".*\\~.*")) {
                throw new RuntimeException("Ошибка формата. Необходимо ввести строку вида text~num");
            } else {
                inputArray = input.split("~");
                int i = Integer.parseInt(inputArray[1]);
                while (strList.size() <= i) {
                    strList.add(null);
                }
                if (inputArray[0].equals("print")) {
                    System.out.println(strList.remove(i));
                } else {
                    strList.set(i, inputArray[0]);
                    System.out.println(strList);
                }
                System.out.println("Введите строку вида text~num, для выхода введите -1");
                input = sc.nextLine();
            }
        }
    }
}

