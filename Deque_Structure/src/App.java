public class App {
    public static void main(String[] args) throws Exception {
        Deque deque = new Deque();

        // Add elements to the front and rear
        deque.addFirst(10);
        deque.addFirst(20);
        deque.addFirst(4);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(23);
        deque.addLast(18);

        // Display elements
        System.out.println("First Element: " + deque.peekFirst()); // 5
        System.out.println("Last Element: " + deque.peekLast()); // 20

        // Remove elements
        System.out.println("Removed First: " + deque.removeFirst()); // 5
        System.out.println("Removed Last: " + deque.removeLast()); // 20

        // Final state
        System.out.println("Size: " + deque.size()); //
    }
}
