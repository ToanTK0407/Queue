import java.util.NoSuchElementException;

public class Deque {
    private static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public Deque() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        // Nếu là node đầu tiên trong linked list thì nó sẽ là đầu và đuôi
        if (isEmpty()) {
            head = tail = newNode;
        }
        // Nếu không phải node đầu tiên thì biến nó thành node head
        else {
            newNode.next = head;
            head.prev = tail;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        int value = head.value;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return value;
    }

    public int removeLast() {
        if (isEmpty()) {
            System.out.println("Deque is empty");
            return -1;
        }
        int value = tail.value;
        if (tail == head) {
            tail = head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return value;
    }

    public int peekFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return head.value;
    }

    public int peekLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return tail.value;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
