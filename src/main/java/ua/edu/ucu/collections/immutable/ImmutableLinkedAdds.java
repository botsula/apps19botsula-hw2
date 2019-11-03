package ua.edu.ucu.collections.immutable;

public interface ImmutableLinkedAdds {
    public ImmutableLinkedList addFirst(Object e); //- додає елемент у початок зв'язаного списку

    public ImmutableLinkedList addLast(Object e); //- додає елемент у кінець зв'язаного списку

    public Object getFirst();

    public Object getLast();

    public ImmutableLinkedList removeFirst(); // видаляє перший елемент

    public ImmutableLinkedList removeLast(); // видаляє останній елемент
}
