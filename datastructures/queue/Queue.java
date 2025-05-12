

public class Queue{
    private Node front;
    private Node rear;
    int length;

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public Queue(int value){
        Node newNode = new Node(value);
        front = newNode;
        rear = newNode;
        length = 1;
    }

    public void enQueue(int value){
        Node newNode = new Node(value);
        if(length == 0){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
        length++;
    }

    public Node deQueue(){
        if(length == 0) return null;
        Node temp = front;
        if(length == 1){
            front = null;
            rear = null;
        }else
        {
            front = front.next;
            temp.next = null;
        }
        length--;
        return temp;
    }



    public void printQueue(){
        Node temp = front;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFront(){
        System.out.println("Front : "+front.value);
    }
    public void getRear(){
        System.out.println("Rear : "+rear.value);
    }
    public void getLength(){
        System.out.println("Length : "+length);
    }

}