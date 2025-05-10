public class Main {
    
    public static void main(String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(7);

        myDoublyLinkedList.append(5);
        myDoublyLinkedList.append(2);
        System.out.println("Last Element removed : "+myDoublyLinkedList.removeLast().value);
        myDoublyLinkedList.prepend(1);
        myDoublyLinkedList.prepend(10);
        System.out.println("First Element removed : "+myDoublyLinkedList.removeFirst().value);
        System.out.println("ELement got is : "+myDoublyLinkedList.get(2).value);
        myDoublyLinkedList.set(1, 599);
        myDoublyLinkedList.insert(1, 101);
        myDoublyLinkedList.insert(0, 1919);
        myDoublyLinkedList.insert(4, 121219);
        System.out.println("Element at index removed : "+myDoublyLinkedList.remove(1).value);
        myDoublyLinkedList.printAll();
    }
}
