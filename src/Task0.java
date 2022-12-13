import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 0.1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль
 * содержимое стэка.
 */
public class Task0 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {1, 2, 3, 5, 5, 8, 9, 7, 0};
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(" " + stack.pop());
        }
        System.out.println();

/* 0.2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль
        * содержимое очереди.*/
    Queue <Integer> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
            System.out.println(queue);
    }

}

