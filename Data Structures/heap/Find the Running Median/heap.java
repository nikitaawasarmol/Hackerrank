 import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the runningMedian function below.
     */
    public static double[] runningMedian(int[] a) {
       PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<Integer> high = new PriorityQueue<>();
       double[] medians = new double[a.length];
       for(int i = 0; i < a.length; i++) {
           int n = a[i];
           addNumber(n, low, high);
           rebalance(low, high);
           medians[i] = getMedian(low, high);
       }
       return medians;

    }
    public static void addNumber(int n, PriorityQueue<Integer> low, PriorityQueue<Integer> high) {
        if(low.size() == 0 || n < low.peek()) {
            low.add(n);
        }
        else
        {
            high.add(n);
        }
    }
    public static void rebalance(PriorityQueue<Integer> low, PriorityQueue<Integer> high)
    {
        PriorityQueue<Integer> largeHeap = low.size() > high.size() ? low : high;
     PriorityQueue<Integer> smallHeap = low.size() > high.size() ? high : low;
     if(largeHeap.size() - smallHeap.size() >= 2) {
         smallHeap.add(largeHeap.poll());
     }
    }

    public static double getMedian(PriorityQueue<Integer> low, PriorityQueue<Integer> high)
    {
        PriorityQueue<Integer> largeHeap = low.size() > high.size() ? low : high;
     PriorityQueue<Integer> smallHeap = low.size() > high.size() ? high : low;

     if (largeHeap.size() == smallHeap.size()) {
         return ((double)largeHeap.peek() + smallHeap.peek())/2;
     }
     else {
         return largeHeap.peek();
     }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int aCount = Integer.parseInt(scanner.nextLine().trim());

        int[] a = new int[aCount];

        for (int aItr = 0; aItr < aCount; aItr++) {
            int aItem = Integer.parseInt(scanner.nextLine().trim());
            a[aItr] = aItem;
        }

        double[] result = runningMedian(a);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bufferedWriter.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}

