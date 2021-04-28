import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < size; i++) {
            elements[i] = sc.nextInt();
        }
        for (int i = size -1; i >= 0; i--)
        {
            System.out.print(elements[i]
             + " ");
        }
    }

}

