/*
 * 1 Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
 * который вернет “перевернутый” список.
 */

import java.util.Deque;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        Deque<Integer> reversedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println(linkedList);
        for (int i : linkedList) {
            reversedList.addFirst(i);
        }
        System.out.println(reversedList);
    }
}
