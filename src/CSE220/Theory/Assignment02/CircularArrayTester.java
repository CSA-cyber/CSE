package CSE220.Theory.Assignment02;

public class CircularArrayTester {
    public static void main(String[] args) {

        Integer[] linear = {10, 20, 30, 40, null};

        System.out.println("\n///// TEST 01 /////");
        CircularArray<Integer> c = new CircularArray<>(linear, 2, 4);
        c.printFullLinear(); // This Should Print: 40, null, 10, 20, 30.
        c.printForward();  // This Should Print: 10, 20, 30, 40.
        c.printBackward(); // This Should Print: 40, 30, 20, 10.

        System.out.println("\n///// TEST 02 /////");
        c.linearize();
        c.printFullLinear(); // This Should Print: 10, 20, 30, 40.

        System.out.println("\n///// TEST 03 /////");
        Integer[] linear2 = {10, 20, 30, 40, 50};
        CircularArray<Integer> c2 = new CircularArray<>(linear2, 2, 5);
        c2.printFullLinear(); // This Should Print: 40, 50, 10, 20, 30.
        c2.resizeStartUnchanged(8); // parameter--> new Capacity
        c2.printFullLinear(); // This Should Print: null, null, 10, 20, 30, 40, 50, null.

        System.out.println("\n///// TEST 04 /////");
        Integer[] linear3 = {10, 20, 30, 40, 50};
        CircularArray<Integer> c3 = new CircularArray<>(linear3, 2, 5);
        c3.printFullLinear(); // This Should Print: 40, 50, 10, 20, 30.
        c3.resizeByLinearize(8); // parameter--> new Capacity
        c3.printFullLinear(); // This Should Print: 10, 20, 30, 40, 50, null, null, null.

        System.out.println("\n///// TEST 05 /////");
        //Object [] linear4 = {10, 20, 30, 40, 50};
        CircularArray<Integer> c4 = new CircularArray<>(linear3, 2, 5);
        c4.printFullLinear(); // This Should Print: 40, 50, 10, 20, 30.
        c4.insertByRightShift(80, 2); //parameter--> elem, pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size
        // Increase array length by 3 if size==cir.length
        // use resizeStartUnchanged() for resizing.
        c4.printFullLinear(); // This Should Print: null, null, 10, 20, 80, 30, 40, 50.

        System.out.println("\n///// TEST 06 /////");
        c4.insertByLeftShift(90, 2); //parameter--> elem, pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size
        // Increase array l
        //
        //
        //
        //
        //
        //
        //
        //
        // length by 3 if size==cir.length
        // use resizeStartUnchanged() for resizing.
        c4.printFullLinear(); // This Should Print: null, 10, 20, 80, 90, 30, 40, 50.
        c4.printForward(); // This Should Print: 10, 20, 80, 90, 30, 40, 50.

        System.out.println("\n///// TEST 07 /////");
        Integer[] linear5 = {10, 20, 30, 40, 50, null, null};
        CircularArray<Integer> c5 = new CircularArray<>(linear5, 3, 5);
        c5.printFullLinear(); // This Should Print: 50, null, null, 10, 20, 30, 40.

        c5.removeByLeftShift(3); //parameter--> pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size-1

        c5.printFullLinear(); // This Should Print: null, null, null, 10, 20, 30, 50.


        System.out.println("\n///// TEST 08 /////");
        //Object [] linear6 = {10, 20, 30, 40, 50, null, null};
        CircularArray<Integer> c6 = new CircularArray<>(linear5, 3, 5);
        c6.printFullLinear(); // This Should Print: 50, null, null, 10, 20, 30, 40.

        c6.removeByRightShift(3); //parameter--> pos. pos --> position relative to start.
        // Valid range of pos--> 0 to size-1

        c6.printFullLinear(); // This Should Print: 50, null, null, null, 10, 20, 30.
        c6.printForward();   // This Should Print: 10, 20, 30, 50.


        System.out.println("\n///// TEST 09 /////");
        Integer[] linear7 = {10, 20, 30, 20, 10, null, null};
        CircularArray<Integer> c7 = new CircularArray<>(linear7, 3, 5);
        c7.printForward();   // This Should Print: 10, 20, 30, 20, 10.
        c7.palindromeCheck();   // This Should Print: This array is a palindrome.


        System.out.println("\n///// TEST 10 /////");
        Integer[] linear8 = {10, 20, 30, 20, null, null, null};
        CircularArray<Integer> c8 = new CircularArray<>(linear8, 3, 4);
        c8.printForward();   // This Should Print: 10, 20, 30, 20.
        c8.palindromeCheck();   // This Should Print: This array is NOT a palindrome.


        System.out.println("\n///// TEST 11 /////");
        Integer[] linear9 = {10, 20, -30, 20, 50, 30, null};
        CircularArray<Integer> c9 = new CircularArray<>(linear9, 5, 6);
        c9.printForward();   // This Should Print: 10, 20, -30, 20, 50, 30.
        c9.sort();
        c9.printForward();   // This Should Print: -30, 10, 20, 20, 30, 50.


        System.out.println("\n///// TEST 12 /////");
        Integer[] linear10 = {10, 20, -30, 20, 50, 30, null};
        CircularArray<Integer> c10 = new CircularArray<>(linear10, 2, 6);
        CircularArray<Integer> c11 = new CircularArray<>(linear10, 5, 6);
        c10.printForward();   // This Should Print: 10, 20, -30, 20, 50, 30.
        c11.printForward();   // This Should Print: 10, 20, -30, 20, 50, 30.
        System.out.println(c10.equivalent(c11));  // This Should Print: true

        System.out.println("\n///// TEST 13 /////");
        Integer[] linear11 = {10, 20, -30, 20, 50, 30, null, null, null};
        c11 = new CircularArray<>(linear11, 8, 6);
        c10.printForward();   // This Should Print: 10, 20, -30, 20, 50, 30.
        c11.printForward();   // This Should Print: 10, 20, -30, 20, 50, 30.
        System.out.println(c10.equivalent(c11));  // This Should Print: true


        System.out.println("\n///// TEST 14 /////");
        Integer[] linear12 = {10, 20, 30, 40, 50, 60, null, null, null};
        CircularArray<Integer> c12 = new CircularArray<>(linear12, 8, 6);
        c10.printForward();   // This Should Print: 10, 20, -30, 20, 50, 30.
        c12.printForward();   // This Should Print: -30, 10, 20, 20, 30, 50.
        System.out.println(c10.equivalent(c12));  // This Should Print: false
    }
}