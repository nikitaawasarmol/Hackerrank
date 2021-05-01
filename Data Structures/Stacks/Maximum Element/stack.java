import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;




public class Solution {
    public static void main(String[] args) throws IOException {
        Stack<Integer> mainstack = new Stack<Integer>();
        Stack<Integer> maxstack = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int op = sc.nextInt();
            if(op != 2){
                if(op == 1){
                    int num = sc.nextInt();

                    mainstack.push(num);
                    if(maxstack.isEmpty())
                    maxstack.push(num);
                    else{
                        max = Math.max(maxstack.peek(),num);
                        maxstack.push(max);
                    }


                }else{
                    System.out.println(maxstack.peek());
                }
            }else{
                mainstack.pop();
                maxstack.pop();
            }
        }
}
}

