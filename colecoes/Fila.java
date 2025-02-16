package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {
    Queue<String> fila = new LinkedList<>();

    // A diferença ocorre quando a fila está cheia
    fila.add("Ana");
    fila.offer("Bia");
    fila.add("Carlos");
    fila.offer("Daniel");
    fila.add("Rafaela");
    fila.offer("Gui");

    // A diferença ocorre quando a fila está vazia
        System.out.println(fila.peek());
        System.out.println(fila.element());

        System.out.println(fila.size());
//        fila.clear();
//        fila.isEmpty();

        // A diferença ocorre quando a fila está vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.size());
    }


}
