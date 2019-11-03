package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {

    public ImmutableLinkedList queue;


    public Queue() {
        queue = new ImmutableLinkedList();
    }

    Object peek() {
        if (queue.isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
        return queue.getLast();
    }

    Object dequeue() {
        if (queue.isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
        Object f = queue.getLast();
        queue = queue.removeLast();
        return f;
    }

    void enqueue(Object e) {
        queue = queue.addFirst(e);
    }
}
