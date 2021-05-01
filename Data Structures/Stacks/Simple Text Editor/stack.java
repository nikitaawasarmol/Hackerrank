 import java.io.*;
import java.util.*;
import java.io.InputStreamReader;

public class Solution {

   public static void main(String[] args) {
    try {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        int T = Integer.parseInt(reader.readLine());
        Stack<String> stack = new Stack<String>();
        String s = "";

        stack.push(s);

        for (int i = 0; i < T; i++) {
            String input = reader.readLine();
            String[] inputArray = input.split(" ");
            switch (inputArray[0]) {
            case "1":
                String value = inputArray[1];
                s = s + value;
                stack.push(s.toString());
                break;
            case "2":
                int delIndex = Integer.parseInt(inputArray[1]);
                s = s.substring(0, s.length() - delIndex);
                stack.push(s);
                break;
            case "3":
                int printIndex = Integer.parseInt(inputArray[1]);
                System.out.println(s.charAt(printIndex - 1));
                break;
            case "4":
                stack.pop();
                s = stack.peek();

                break;
            }
        }
    } catch (NumberFormatException | IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}

}




