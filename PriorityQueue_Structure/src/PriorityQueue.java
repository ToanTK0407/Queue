public class PriorityQueue {
    private class Node {
        int value;
        Node next;
        int priority;

        public Node(int value, int priority) {
            this.value = value;
            this.priority = priority;
            this.next = null;
        }
    }

    private Node head;

    public PriorityQueue() {
        head = null;
    }

    public void add(int value, int priority) {
        Node newNode = new Node(value, priority);

        // Nếu hàng đợi rỗng hoặc phần tử mới có ưu tiên cao nhất
        if (head == null || priority > head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            // Tìm vị trí chèn
            Node current = head;
            while (current.next != null && current.next.priority >= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.value;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value + ": " + current.priority);
            current = current.next;
        }
    }
}
