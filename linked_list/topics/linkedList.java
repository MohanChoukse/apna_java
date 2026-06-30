// package apna_java.linked_list.topics;

 class DoubleLL {
   
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private static Node head;
    private  static int size;
    private static Node tail;


    // public DoubleLL() {
    //     this.head = null;
    //     this.tail = null;

    // }


    public  void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
    }


    public int removeLast(){
         if(tail == null){
            System.out.println("DLL is empty");
            return -1;
         }

         if(size == 1){
            int val = tail.data ;
            head = tail = null;
            return val;
         }

         int val  = tail.data;
         tail = tail.prev;
         tail.next = null;
         size--;
         return  val;

    }
    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
    }

   
   
   
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
            current = current.next;
        }
        System.out.println("Null");
    }
}

public class linkedList {
    public static void main(String[] args) {
        DoubleLL list = new DoubleLL();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Elements in the linked list:");
        list.display();
        list.removeLast();
        list.display();
    }
}