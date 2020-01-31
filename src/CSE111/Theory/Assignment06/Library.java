package CSE111.Theory.Assignment06;

import java.util.HashSet;

public class Library<E extends MediaInterface> {
    private HashSet<E> records = new HashSet<>();

    public void add(E e){
        records.add(e);
        e.setRef(this);
    }

    public void delete(E e){
        records.remove(e);
    }

    public void print(){
        for (E i : records) {
            System.out.println(i);
        }
    }

    public void printConditionally(E e){
        for (E i : records) {
            if (e.getClass().isInstance(i))
                System.out.println(i);
        }
    }
}

