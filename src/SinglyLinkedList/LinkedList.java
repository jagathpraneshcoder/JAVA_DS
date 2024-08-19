package SinglyLinkedList;

public class LinkedList {
    Node head=null;

    public void insert(int data) {
        Node node = new Node();
        node.data= data;
        node.next=null;

        if(head==null) {
            head=node;
        }

        else {
            Node n = head;

            while(n.next!=null) {
                n=n.next;
            }

            n.next=node;
        }
        System.out.println("Inserted Successfully at the end.");
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data=data;
        node.next=head;
        head=node;
        System.out.println("Inserted Successfully at the begining");
    }

    public void insertAtBtwindex(int data,int position) {
        Node node = new Node();
        node.data=data;
        node.next=null;
        int count=0;
        Node n=head;
        Node shadow=null;
        while(n!=null) {
            count+=1;
            n=n.next;
        }
        if(position<=0) {
            System.out.println("The position is invalid");
        }
        else if(count<position) {
            System.out.println("The position is out of index");
        }
        else {
            n=head;
            while(n!=null && position!=1) {
                shadow=n;
                n=n.next;
                position-=1;
            }
            node.next=n;
            shadow.next=node;
        }
        System.out.println("Inserted Successfully at the middle.");
    }

    public void insertAtBtwvalue(int data, int target) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        Node n = head;
        Node shadow = null;

        while (n != null && n.data != target) {
            shadow = n;
            n = n.next;
        }

        if (n == null) {
            System.out.println("Element not found");

        }
        else {
            node.next = n;
            shadow.next = node;
            System.out.println("Inserted Successfully at the middle");
        }

    }

    public void delete(int position) {
        Node n=head;
        Node s=null;
        int count=0;
        while(n!=null) {
            count+=1;
            n=n.next;
        }
        n=head;
        if(position==1) {
            head=head.next;
            n=null;
        }
        else if(position>count || position<=0){
            System.out.println("Element goes out of position");
        }
        else {
            while(n!=null && position!=1) {
                s=n;
                n=n.next;
                position-=1;
            }

            if(n==null) {
                System.out.println("Element not found");
            }
            else {
                s.next=n.next;
                n.next=null;
                System.out.println("Element Deleted Successfully");
            }
        }
    }

    public void deletetarget(int target) {
        Node n=head;
        Node s=null;
        if(n.data==target){
            head=null;
        }
        else {
            while(n!=null && n.data!=target) {
                s=n;
                n=n.next;
            }
            if(n==null) {
                System.out.println("Element couldnt delete");
            }
            else {
                s.next=n.next;
                n.next=null;
                n=null;
                System.out.println("Element Deleted Successfully");
            }

        }
    }




    public void show() {
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node n = head;
            while(n!=null) {
                System.out.print(n.data + " ");
                n=n.next;
                System.out.println(" ");
            }
        }
    }

    public void reverse() {
        if(head==null) {
            System.out.println("Reversing is not possible");
        }
        else {

            Node current=head;
            Node prev = null;
            Node temp=head;
            while(temp!=null) {
                temp=temp.next;
                current.next=prev;
                prev=current;
                current=temp;
            }
            head=prev;
            System.out.println("Reversing is done.");
        }
    }

}
