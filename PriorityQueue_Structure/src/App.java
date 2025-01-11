public class App {
    public static void main(String[] args) throws Exception {
        PriorityQueue pq = new PriorityQueue();

        pq.add(4, 2);
        pq.add(2, 1);
        pq.add(3, 3);

        pq.display();
        System.out.println();
        pq.poll();

        pq.display();
    }
}
