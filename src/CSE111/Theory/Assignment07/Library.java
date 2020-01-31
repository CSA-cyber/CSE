package CSE111.Theory.Assignment07;

import java.util.HashSet;

public final class Library<E extends MediaInterface> {
    private HashSet<E> records = new HashSet<>();

    public void add(E e){
        records.add(e);
        e.setRef(this);
    }

    public E get(E e) {
        for (E i: records) {
            if (e.equals(i))
                return i;
        }
        return null;
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

    public boolean contains(E e) {
        return records.contains(e);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (E e: records)
            sb.append(e + "\n");
        return sb.toString();
    }
}

