
public class DoublyLinkedList
{
    private Node head;
    private Node tail;
    private int length;

    class Node
    {
        int value;
        Node next;
        Node prev;

        public Node(int value)
        {
            this.value = value;
        }
    }

    public DoublyLinkedList(int nodeValue)
    {
        Node newNode = new Node(nodeValue);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length==0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;
        Node temp = tail;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if(length == 0 ) return null;
        Node temp = head;
        if(length == 1){
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index){
        if(index < 0 || index > length) return null;
        if(index == 0) return head;
        if(index == length - 1) return tail;
        Node temp = head;
        for(int i = 0; i < index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public void set(int index, int value){
        Node temp = get(index);
        temp.value = value;
    }

    public void insert(int index, int value){
        if(index == 0){
            prepend(value);
            return;
        }
        if(index == length)
        {
            append(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = get(index-1);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        length++;
    }

    public Node remove(int index){
        if(index < 0 || index > length) return null;
        if(index == 0){
            return removeFirst();
        }
        if(index == length-1){
            return removeLast();
        }
        Node prev = get(index-1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next.prev = prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public void printAll(){
        Node temp = head;
        System.out.println("length : " + length);
        while(temp!=null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}