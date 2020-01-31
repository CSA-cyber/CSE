package CSE220.Theory.Assignment01;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class LinearArray<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elementdata;
    private int size = 0;

    public LinearArray() {
        this(DEFAULT_CAPACITY);
    }

    public LinearArray(int initialSize) {
        if (initialSize >= 0)
            this.elementdata = (E[]) new Object[initialSize];
        else
            throw new IllegalArgumentException("Illegal capacity" + initialSize);
    }

    public LinearArray(E[] array) {
        this.elementdata = array;
        size = array.length;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.println(this);
    }

    // creates a reversed copy of the source array and returns the reference of the newly created reversed array
    public void reverse() {
        for (int i = 0; i < size() / 2; i++) {
            E swap = elementdata[i];
            elementdata[i] = elementdata[size() - i - 1];
            elementdata[size() - i - 1] = swap;
        }
    }

    private void increase() {
        if (elementdata.length > size())
            return;

        elementdata = Arrays.copyOf(elementdata, (int) Math.max(size * 1.25, size + 1));
    }

    // Shifts all the elements of the source array to the left by 1 positions
    public void shiftLeft(int from) {
        for (int i = 1; i < from; i++)
            elementdata[i - 1] = elementdata[i];

        elementdata[from] = null;
    }

    // Shifts all the elements of the source array from given index to the right by 1 positions
    public void shiftRight(int from) {
        for (int i = elementdata.length > size ? size : size - 1; i > from; i--)
            elementdata[i] = elementdata[i - 1];

        elementdata[from] = null;
    }

    // Rotates all the elements of the source array to the left by 'k' positions
    // Returns the updated array
    public void rotateLeft(int k) {
        E[] newArray = (E[]) new Object[size()];
        for (int i = k; i < size(); i++)
            newArray[i - k] = elementdata[i];

        for (int i = 0; i < size() - k; i++)
            newArray[i + k] = elementdata[i];
        elementdata = newArray;
    }

    // Rotates all the elements of the source array to the right by 'k' positions
    public void rotateRight(int k) {
        E[] newArray = (E[]) new Object[size()];
        for (int i = k; i < size(); i++)
            newArray[i] = elementdata[i - k];

        for (int i = 0; i < size() - k; i++)
            newArray[i] = elementdata[i + k];

        elementdata = newArray;
    }

    public boolean insert(int index, E elem) {
        if ((index >= size()) || (index < 0))
            throw new IllegalArgumentException("Illegal index" + index);

        increase();
        shiftRight(index);
        elementdata[index] = elem;
        size++;
        return true;
    }

    public boolean removeAll(E elem) {
        boolean flag = false;
        for (E e : elementdata)
            if (e == elem) {
                flag = true;
                break;
            }

        if (!flag)
            return false;

        E[] newArray = (E[]) new Object[elementdata.length];
        int it = 0;
        for (E value : elementdata) {
            if (value == elem)
                continue;
            newArray[it++] = value;
        }
        elementdata = newArray;
        return true;
    }

    public void sort() {
        Arrays.sort(elementdata, 0, size());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < size(); i++)
            sb.append(elementdata[i]).append(',').append(' ');

        sb.setLength(sb.length() - 2);
        sb.append('}');
        return sb.toString();
    }
}
