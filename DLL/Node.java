class Node {
  int data;
  Node next;
  Node prev;

  Node() {
  }

  Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }

  Node(int data, Node next, Node prev) {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }

  static Node createNode(int[] arr){
		if(arr.length==0) return null;
		Node head = new Node(arr[0]);
		Node temp = head;
		for(int i = 1 ; i < arr.length ; i++){
			Node cc = new Node(arr[i],null,temp);
			temp.next=cc;
			temp = temp.next;
		}
		return head;
	}

  static void display(Node head){
		if(head == null){
			System.out.println("Nothing to Display");
			return;
		}

		while(head.next!=null){
			System.out.print(head.data+"<=>");
			head=head.next;
		}
		Node temp=head;
		System.out.println(head.data);

		System.out.println("-----------------------------");
		
		while(temp.prev!=null){
			System.out.print(temp.data+"<=>");
			temp=temp.prev;
		}
		System.out.println(temp.data);
	}

}