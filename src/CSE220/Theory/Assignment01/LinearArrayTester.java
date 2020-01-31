package CSE220.Theory.Assignment01;

public class LinearArrayTester {
    public static void main(String [] args){
        Integer [] a = {10, 20, 30, 40, 50, 60};
        LinearArray<Integer> linear = new LinearArray<>(a);

        linear.print();
        linear.insert(2, 7);
        linear.sort();
        linear.print();

        System.out.println("\n///// TEST 04: Shift Left k cell example /////");

        System.out.println();
    }
}