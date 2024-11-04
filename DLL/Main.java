import java.util.*;
class  Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		Node head = Node.createNode(arr);
		Node.display(head);
		head=Insert.insertBeforeLast(head,10);
		Node.display(head);
		head=Insert.insertAfterLast(head,20);
		Node.display(head);
		sc.close();
	}
}
