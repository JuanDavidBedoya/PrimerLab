package QuintoPunto;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> lista = new HashSet<>();
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(3);
        lista.add(5);

        Iterator<Integer> iterator = lista.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
