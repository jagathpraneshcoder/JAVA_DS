class Insert{
    static Node insertBeforeFront(Node head,int data){
			Node newNode = new Node(data,head,null);
			head.prev = newNode;
			head = newNode;
			return head;
	}
	
	static Node insertAfterFront(Node head,int data){
		Node newNode = new Node(data,head.next,head);
		if(head.next==null){
			head.next=newNode;
			return head;
		}
		Node prev = head.next;
		prev.prev = newNode;
		head.next = newNode;
		return head;
	}
	
	static Node insertAfterLast(Node head,int data){
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next = new Node(data,null,temp);
		return head;
	}

	static Node insertBeforeLast(Node head,int data){
		if(head.next==null){
			head.prev = new Node(data,head,null);
			return head;
		}
		Node temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		Node shadow = temp.prev;
		Node newNode = new Node(data,temp,shadow);
		shadow.next = newNode;
		temp.prev = newNode;
		return head;
	}
}