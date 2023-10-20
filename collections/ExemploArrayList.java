package collections;

import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList <String> listadeNomes = new ArrayList<>();

        listadeNomes.add("Alice");
        listadeNomes.add("Bob");
        listadeNomes.add("Carol");

        System.out.println(listadeNomes.get(1));
        for (String nome : listadeNomes){
            System.out.println(nome);
        }
        if(listadeNomes.contains("Bob")){
            System.out.println("Bob está na lista");
        }

        listadeNomes.remove("Bob");
        if (!listadeNomes.contains("Bob")){
            System.out.println("Bob não está na lista");
        }

        listadeNomes.clear();
        if(listadeNomes.isEmpty()){
            System.out.println("lista está vazia");
        }

    }
}
