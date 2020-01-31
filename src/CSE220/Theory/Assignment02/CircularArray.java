package CSE220.Theory.Assignment02;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class CircularArray<E> {
    private E[] circular;
    private int start;
    private int size;
    private int capacity;
    private int it = 0;

    /*
     * if Object [] lin = {10, 20, 30, 40, null}
     * then, CircularArray(lin, 2, 4) will generate
     * Object [] cir = {40, null, 10, 20, 30}
     */

    public CircularArray(E[] linear, int start, int size) {
        this.circular = (E[]) new Object[linear.length];
        this.start = start;
        this.size = size;
        this.capacity = circular.length;

        for (int i = start; i < capacity; i++)
            circular[i] = linear[it++];

        for (int i = 0; i < start; i++)
            circular[i] = linear[it++];

        it = 0;
    }

    /*
     *returns the number of elements in the circular array
     */

    public int size() {
        return size;
    }

    public E next() {
        it %= capacity;
        return circular[it++];
    }

    public E prev() {
        it %= capacity;
        return circular[(capacity - ++it) % capacity];
    }

    public E get(int index) {
        return circular[index % size()];
    }

    public void printFullLinear() {
        System.out.println(Arrays.toString(circular));
    }

    // Starts Printing from index start. Prints a total of size elements
    public void printForward() {
        System.out.println(this);
    }

    public void printBackward() {
        it = size();
        StringBuilder sb = new StringBuilder().append('[');
        for (int i = 0; i < size(); i++)
            sb.append(prev()).append(',').append(' ');

        sb.setLength(Math.max(sb.length() - 2, 0));
        sb.append(']');
        System.out.println(sb.toString());
    }

    // With no null cells
    public void linearize() {
        E[] l = (E[]) new Object[size()];

        for (int i = 0, j = start; i < size(); i++, j = (j + 1) % circular.length)
            l[i] = circular[j];

        circular = l;
        start = 0;
    }

    // Do not change the Start index
    public void resizeStartUnchanged(int new_capacity) {
        E[] n = (E[]) new Object[new_capacity];
        int i = start;
        int j = start;

        for (int x = 0; x < size(); x++) {
            n[i] = circular[j];
            i = (i + 1) % n.length;
            j = (j + 1) % circular.length;
        }

        circular = n;
        capacity = circular.length;
    }

    // Start index becomes zero
    public void resizeByLinearize(int new_capacity) {
        linearize();
        E[] newCircular = (E[]) new Object[new_capacity];
        System.arraycopy(circular, 0, newCircular, 0, circular.length);
        circular = newCircular;
        capacity = circular.length;
    }

    private void increase() {
        if (size == circular.length)
            resizeStartUnchanged(size + 3);
    }

    private void shiftRight(int from, int to) {
        for (int i = to; i >= from; i--)
            circular[i] = circular[i - 1];

        circular[from] = null;
    }

    private void shiftLeft(int from, int amount) {
        it = from;
        int to = from - 1;
        to = to < 0 ? capacity - 1 : to;

        while (amount-- > 0)
            circular[to++ % capacity] = next();

        circular[to % capacity] = null;
    }

    /* index --> position relative to start. Valid range of pos--> 0 to size.
     * Increase array length by 3 if size==cir.length
     * use resizeStartUnchanged() for resizing.
     */

    public void insertByRightShift(int index, E elem) {
        increase();
        index += start;
        index %= capacity;
        shiftRight(index, capacity - 1);
        circular[index] = elem;
        size++;
    }

    public void insertByLeftShift(int index, E elem) {
        increase();
        int amount = index % capacity + 1;
        shiftLeft(start, amount);
        index += start--;
        index %= capacity;
        circular[index] = elem;
        size++;
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByLeftShift(int index) {
        int amount = size() - index;
        index += start;
        index %= capacity;
        circular[index++] = null;
        shiftLeft(index % capacity, amount);
        size--;
    }

    /* parameter--> pos. pos --> position relative to start.
     * Valid range of pos--> 0 to size-1
     */
    public void removeByRightShift(int index) {
        index += start;
        index %= capacity;
        circular[index] = null;
        shiftRight(start++, index);
        size--;
    }

    //This method will check whether the array is palindrome or not
    public void palindromeCheck() {
        E[] linear = toArray();
        for (int i = 0; i < size() / 2; i++)
            if (linear[i] != linear[size() - i - 1]) {
                System.out.println("This array NOT is a palindrome.");
                return;
            }

        System.out.println("This array is a palindrome.");
    }

    //This method will sort the values by keeping the start unchanged
    public void sort() {
        E[] array = toArray();
        Arrays.sort(array);
        circular = new CircularArray<>(Arrays.copyOf(array, capacity), start, size()).circular;
    }

    public E[] toArray() {
        E[] array = (E[]) new Object[size()];
        it = start;

        for (int i = 0; i < size(); i++)
            array[i] = next();

        return array;
    }

    //This method will check the given array across the base array and if they are equivalent in terms of values return true, or else return false
    public boolean equivalent(CircularArray<E> k) {
        E[] k_array = k.toArray();
        it = start;
        for (Object o : k_array)
            if (o != next())
                return false;

        return true;
    }

    @Override
    public String toString() {
        it = start;
        StringBuilder sb = new StringBuilder().append('[');
        for (int i = 0; i < size(); i++)
            sb.append(next()).append(',').append(' ');

        sb.setLength(Math.max(sb.length() - 2, 0));
        sb.append(']');
        return sb.toString();
    }
}