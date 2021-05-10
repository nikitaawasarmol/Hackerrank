import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfelement = sc.nextInt();
        int a[] = new int[numberOfelement];
        for (int i = 0; i < numberOfelement; i++) {
            a[i] = sc.nextInt();
        }
        int Swaps = 0;
        for (int i = 0; i < numberOfelement; i++) {

            for (int j = 0; j < numberOfelement - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    Swaps++;
                }
            }
            if (Swaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + Swaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }

}

