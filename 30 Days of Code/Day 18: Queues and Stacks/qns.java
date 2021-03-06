 


public class Solution {
    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

void pushCharacter(Character ch) {
    stack.push(ch);
}

void enqueueCharacter(char ch) {
    queue.add(ch);
}

char popCharacter(){
    return stack.pop();
}

char dequeueCharacter() {
    return queue.remove();
}

