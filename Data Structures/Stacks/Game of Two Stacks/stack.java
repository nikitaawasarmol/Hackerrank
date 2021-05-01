 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {
    static int twoStacks(int x, int[] a, int[] b) {

        int a_index = 0;
        int b_index = 0;
        int count = 0;
        int sum = 0;
        // move b_index to the position where if only take elements from B, last element it can take
        while (b_index < b.length && sum + b[b_index] <= x) {
            sum += b[b_index];
            b_index++;
        }
        // loop exits only when b_index reaches end or sum > x; in both case b_index should decrease
        b_index--;
        count = b_index + 1;

        while (a_index < a.length && b_index < b.length) {
            sum += a[a_index];
            if (sum > x) {
                while (b_index >= 0) {
                    sum -= b[b_index];
                    b_index--;
                    if (sum <= x) break;
                }
                // if even no elements taken from B, but still sum greater than x, then a[a_index] should not be chosen
                // and loop terminates
                if (sum > x && b_index < 0) {
                    a_index--;
                    break;
                }
            }
            count = Math.max(a_index + b_index + 2, count);
            a_index++;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {

            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());
            int m = Integer.parseInt(nmx[1].trim());
            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];
            String[] aItems = scanner.nextLine().split(" ");
            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];
            String[] bItems = scanner.nextLine().split(" ");
            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);
            System.out.println(result);
        }
    }

}

