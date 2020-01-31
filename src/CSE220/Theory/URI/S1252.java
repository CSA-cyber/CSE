package CSE220.Theory.URI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class S1252 {
    static class sort implements Comparator<Integer> {
        final int M;

        sort(int m) {
            M = m;
        }
        @Override
        public int compare(Integer a, Integer b) {
            int am = a % M;
            int bm = b % M;
            if (am < bm)
                return -1;
            else if (am == bm) {
                if (a % 2 == 1 && b % 2 == 0)
                    return -1;
                else if (a % 2 == 1 && b % 2 == 1)
                    return -a.compareTo(b);
                else
                    return a.compareTo(b);
            }
            else return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, M;

        while ((N = in.nextInt()) != 0 && (M = in.nextInt()) != 0) {
            Integer[] numbers = new Integer[N];
            for (int i = 0; i < N; i++)
                numbers[i] = in.nextInt();

            Arrays.sort(numbers, new sort(M));

            StringBuilder sb = new StringBuilder(String.format("%d %d\n", N, M));
            for (Integer n : numbers)
                sb.append(n).append('\n');

            System.out.print(sb.toString());
        }

        System.out.println("0 0");
    }
}
