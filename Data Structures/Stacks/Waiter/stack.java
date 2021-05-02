import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the waiter function below.
     */
    static int[] waiter(int[] number, int q) {
        //get needed amount of prime number
        int[] primes = getPrimes(q);
        int[] answers = new int[number.length];
        Stack<Integer> stackMain = new Stack<>();
        int pointer = 0;
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();

        for(int i = 0; i < number.length; i++)
        stackMain.push(number[i]);

        for(int i: primes){
            stackA = new Stack<>();
            stackB = new Stack<>();
            while(!stackMain.isEmpty()){
                int current = stackMain.pop();
                if(current % i == 0){
                    stackB.push(current);
                }else{
                    stackA.push(current);
                }
            }

            while(!stackB.isEmpty()){
                int current = stackB.pop();
                answers[pointer] = current;
                pointer++;
            }
            stackMain = stackA;
        }

        while(!stackA.isEmpty()){
                int current = stackA.pop();
                answers[pointer] = current;
                pointer++;
            }

        return answers;
    }


static int[] getPrimes(int N){
    int count = 0;
    int num = 2;
    int[] primes = new int[N];
    while(count != N) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }

        }
        if (prime) {
            primes[count] = num;
            count++;

        }
        num++;
    }
    return primes;
}



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nq[0].trim());

        int q = Integer.parseInt(nq[1].trim());

        int[] number = new int[n];

        String[] numberItems = scanner.nextLine().split(" ");

        for (int numberItr = 0; numberItr < n; numberItr++) {
            int numberItem = Integer.parseInt(numberItems[numberItr].trim());
            number[numberItr] = numberItem;
        }

        int[] result = waiter(number, q);

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

