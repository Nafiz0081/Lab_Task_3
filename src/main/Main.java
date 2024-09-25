package main;

public class Main {
    public static void main(String[] args) {
        MaxStack stack = new MaxStack();


        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(21);
        System.out.println("Max Value of the stack is: " + stack.max());
        System.out.println("Min Value of the stack is: " + stack.min());

        stack.pop();
        System.out.println("Max after popping one time: " + stack.max());

        stack.push(25);
        stack.push(30);

        System.out.println("Max: " + stack.max());

    }
}
