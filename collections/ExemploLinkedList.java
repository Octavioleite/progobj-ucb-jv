package collections;

import java.util.LinkedList;

import javax.lang.model.element.Element;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> inteiros = new LinkedList<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);

        System.out.println(inteiros.get(1));
        inteiros.add(1, 4);
        System.out.println(inteiros.get(1));

    }
}
