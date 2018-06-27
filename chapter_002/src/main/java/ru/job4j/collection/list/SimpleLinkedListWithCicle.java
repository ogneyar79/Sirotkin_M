package ru.job4j.collection.list;

public class SimpleLinkedListWithCicle {
    class Node<T> {
        T value;
        Node<T> next;
    }


    boolean hasCycle(Node first) {
        boolean result = false;
        if (first == null) {
            result = false;
        } else if (first.next == first) {
            result = true;
        }

        Node slow = first;
        Node fast = first;     // create two references.

        while (true) {
            if (fast == null) {
                result = false;
                break;
            }
             else if (fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (slow == fast) {              // if the two ever meet...we must have a loop
                    result = true;
                    break;
                }
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

}
