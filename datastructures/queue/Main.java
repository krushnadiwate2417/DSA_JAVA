public class Main {
    public static void main(String[] args) {
        
        Queue myQueue = new Queue(5);
        myQueue.enQueue(15);
        myQueue.enQueue(61);

        System.out.println(myQueue.deQueue().value);

        myQueue.getFront();
        myQueue.getRear();
        myQueue.getLength();
        myQueue.printQueue();
    }
}
