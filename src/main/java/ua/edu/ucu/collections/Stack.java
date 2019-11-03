package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {


    public ImmutableLinkedList stack;

    Stack() {
        stack = new ImmutableLinkedList();
    }

    Object peek() {
        if (stack.isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty.");
        }
        return stack.getFirst();
    }

    Object pop() {
        Object s = stack.getFirst();
        stack = stack.removeFirst();
        return s;
    }

    void push(Object e) {
        stack = stack.addFirst(e);
    }
}
