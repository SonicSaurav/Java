package Java;
public class LL{
    Node head;
    private int size;

    LL(){
        this.size =0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("List Is Empty");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head==null){
            return ;
        }
        size--;
        if(head.next==null){
            head=null;
        }
        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next=null;

    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("List");
        list.printlist();
        list.deleteFirst();
        list.printlist();
        System.out.println(list.getSize());
    }
}
