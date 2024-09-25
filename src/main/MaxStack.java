package main;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    private Stack<Integer> minStack;

    public MaxStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
        minStack = new Stack<>();
    }


    public void push(int value) {
        mainStack.push(value);


        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
        if (minStack.isEmpty() || value<= minStack.peek()) {
            minStack.push(value);
        }
    }


    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Unable to pop.The stack is empty");
        }
        int poppedValue = mainStack.pop();

        if (poppedValue == maxStack.peek()) {
            maxStack.pop();
        }
        if (poppedValue == minStack.peek()) {
            minStack.pop();
        }

        return poppedValue;
    }

    // Max operation to return the current maximum in the stack
    public int max() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return maxStack.peek();  // The top of the max stack is the current maximum
    }
    public int min() {
        if (minStack.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return minStack.peek();
    }

}

