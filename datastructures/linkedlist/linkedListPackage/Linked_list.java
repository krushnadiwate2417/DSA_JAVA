package linkedListPackage;



public class Linked_list
{
    private int length;
    private Node head;
    private Node tail;

    class Node 
    {
        int value;
        Node next;

        Node(int nodeValue)
        {
            this.value = nodeValue;
        }
    }


    public Linked_list(int nodeValue)
    { 
        Node newNode = new Node(nodeValue);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int elementValue)
    {   
        Node newNode = new Node(elementValue);
        if(length == 0)
        {
            head = newNode;
            tail = newNode;

        }else{

            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public void prepend(int elementValue)
    {
        Node newNode = new Node(elementValue);
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insert(int index,int elementValue)
    {
        if(index == 0){prepend(elementValue);}
        if(index == length-1){append(elementValue);}
        Node newNode = new Node(elementValue);
        Node temp = head;
        for(int i = 0; i<index-1;i++)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
    }

    public void removeLast()
    {   
        Node temp;
        Node pre;
        if(length == 1)
        {
            head = null;
            tail = null;
        }else if(length == 0)
        {
            System.out.println("Error : Linked List is empty");
        }else
        {
            temp = head;
            pre = head;
            while(temp.next != null)
            {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            System.out.println("Removed Node : " + temp.value);
        }
        length--;
    }

    public void printList()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println("Length : "+ length);
    }

    public void getHead()
    {
        System.out.println("Head : "+head.value);
    }
    
    public void getTail()
    {
        System.out.println("Tail : "+tail.value);
    }

}