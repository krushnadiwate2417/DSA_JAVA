package linkedListPackage;



public class Linked_list
{
    private int length;
    private Node head;
    private Node tail;

    public class Node 
    {
        public int value;
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
        if(length == 0)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }


    public Node removeLast()
    {   
        Node temp = head;
        Node pre = head;
        if(length == 1)
        {
            head = null;
            tail = null;
            return temp;
        }else if(length == 0)
        {
            System.out.println("Error : Linked List is empty");
            return null;
        }else
        {
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
        return temp;
    }

    public Node removeFirst()
    {
        Node temp = head;
        if(length == 1)
        {
            head = null;
            tail = null;
        }
        else if(length == 0)
        {
            System.out.println("Error : Linked List is empty");
            return null;
        }
        else
        {
            head = head.next;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node getNode(int index)
    {
        Node temp = head;

        if(index < 0 || index >= length)
        {
            return null;
        }

        for(int i = 0;i<index;i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    public boolean setNode(int index, int value)
    {
        Node temp = getNode(index);
        if(temp == null)
        {
            return false;
        }
        temp.value = value;
        return true;
    }

        public boolean insert(int index,int elementValue)
    {   
        if(index < 0 || index > length)
        {
            return false;
        }

        if(index == 0)
        {
            prepend(elementValue);
            return true;
        }
        if(index == length)
        {
            append(elementValue);
            return true;
        }
        Node newNode = new Node(elementValue);
        Node temp = getNode(index-1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index)
    {
        if(index == 0)
        {
            return removeFirst();
        }
        if(index == length-1)
        {
            return removeLast();
        }
        Node prev = getNode(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }

    public void reverse()
    {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for(int i = 0; i<length;i++)
        {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
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