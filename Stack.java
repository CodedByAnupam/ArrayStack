package Stack;
public class Stack {
    public static void main(String[] args) {

        ArrayStack arr = new ArrayStack(8);

        System.out.println(arr);

        System.out.println("Is stack empty? " + arr.isEmpty());
        System.out.println("Is stack full? " + arr.isFull());

        arr.push(5);
        arr.push(2);
        arr.push(6);
        arr.push(4);
        arr.push(2);
        arr.push(1);

        System.out.println(arr);

        System.out.println("Is stack empty? " + arr.isEmpty());
        System.out.println("Is stack full? " + arr.isFull());

        System.out.println("Peek: " + arr.peek());

        System.out.println("Pop: " + arr.pop());

        System.out.println(arr);
    }
}