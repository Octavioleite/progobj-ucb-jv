package collections;

import java.util.HashSet;

public class ExemploHastSet {
    public static void main(String[] args) {
        HashSet <Integer> inteiros = new HashSet<>();

        inteiros.add(1);
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(3);

        for (Integer i : inteiros){
            System.out.println(i);
        }
        inteiros.contains(3);
        inteiros.remove(1);
        inteiros.clear();
        inteiros.isEmpty();
        
    }
}
