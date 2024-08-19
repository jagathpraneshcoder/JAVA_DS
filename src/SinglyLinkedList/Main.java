package SinglyLinkedList;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc =  new Scanner(System.in);
        int x=0,y=0;
        boolean ch= true;
        while(ch) {
            System.out.println("1.To Insert a node at start.");
            System.out.println("2.To Insert a node at middle based on position.");
            System.out.println("3.To Insert a node at middle based on value.");
            System.out.println("4.To Insert a node at end.");
            System.out.println("5.To Delete a node based on position.");
            System.out.println("6.To Delete a node based on taregt.");
            System.out.println("7.To Show the ll.");
            System.out.println("8.To Reverse.");
            System.out.println("9.To Exit.");
            int a=sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("Enter the element to insert");
                    x=sc.nextInt();
                    list.insertAtStart(x);
                    break;

                case 2:
                    System.out.println("Enter the element to insert");
                    x=sc.nextInt();
                    System.out.println("Enter the position to insert");
                    y=sc.nextInt();
                    list.insertAtBtwindex(x, y);
                    break;

                case 3:
                    System.out.println("Enter the element to insert");
                    x=sc.nextInt();
                    System.out.println("Enter the data to insert");
                    y=sc.nextInt();
                    list.insertAtBtwvalue(x, y);
                    break;

                case 4:
                    System.out.println("Enter the element to insert");
                    x=sc.nextInt();
                    list.insert(x);
                    break;

                case 5:
                    System.out.println("Enter the element to delete based on position");
                    x=sc.nextInt();
                    list.delete(x);
                    break;

                case 6:
                    System.out.println("Enter the element to delete based on target");
                    x=sc.nextInt();
                    list.deletetarget(x);
                    break;

                case 7:
                    System.out.println("-------------------------");
                    list.show();
                    System.out.println("-------------------------");
                    break;

                case 8:
                    list.reverse();
                    System.out.println("-------------------------");
                    list.show();
                    System.out.println("-------------------------");
                    break;

                case 9:
                    ch=false;
                    break;

                default:
                    System.out.println("Enter the correct value");
                    break;
            }
        }
        System.out.println("--------------------");
        System.out.println("The Final Linked List");
        list.show();
        System.out.println("-----------------------");
        System.out.println("The program is finished");
        sc.close();
    }


}
