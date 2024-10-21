package Stack;

public class ArrayStack {
    private int[] stack;
    private int maxSize;
    private int top;

    public ArrayStack(int size) {
        stack = new int[size];
        maxSize = size;
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + val);
            return;
        }
        top += 1; // top++
        stack[top] = val;
        System.out.println(val + " added to the Stack successfully!");
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        }

        int val = stack[top];
        top -= 1; //top--
        return val;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -1;
        }

        return stack[top];
    }

    public String toString() {
        if (isEmpty()) {
            return "Stack is empty";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Stack contents: ");
        for (int i = 0; i <= top; i++) {
            sb.append(stack[i] + " ");
        }

        return sb.toString();
    }
}
