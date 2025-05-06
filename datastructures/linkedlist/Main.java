import linkedListPackage.Linked_list;

public class Main
{
    public static void main(String agrs[])
    {
        Linked_list myLinkedList = new Linked_list(4);
        myLinkedList.append(7);
        myLinkedList.append(8);
        myLinkedList.append(9);
        myLinkedList.reverse();
        myLinkedList.printList();
        myLinkedList.getHead();
        myLinkedList.getTail();
    }
}